package br.com.deGraoEmGrao.security;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import br.com.deGraoEmGrao.models.DoadorPF;
import br.com.deGraoEmGrao.repository.DoadorPFRepository;
import jakarta.validation.Valid;

@Service
public class TokenService {
	
	@Autowired
	DoadorPFRepository doadorPFRepository;
	
	@Value("${jwt.secret}")
	String secret;
	
	public Token generateToken(@Valid Credencial credencial) {
		Algorithm alg = Algorithm.HMAC256(secret);
		String token = JWT.create()
				.withSubject(credencial.email())
				.withIssuer("DeGraoEmGrao")
				.withExpiresAt(Instant.now().plus(1, ChronoUnit.HOURS))
				.sign(alg);
		
		return new Token(token, "JWT", "Bearer");
	}

	public DoadorPF getValidateUser(String token) {
		Algorithm alg = Algorithm.HMAC256(secret);
		var email = JWT.require(alg)
				.withIssuer("DeGraoEmGrao")
				.build()
				.verify(token)
				.getSubject();
		
		return doadorPFRepository.findByEmail(email)
				.orElseThrow(() -> new JWTVerificationException("Usuário inválido"));
	}

}
