package br.com.deGraoEmGrao.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public record Credencial(String email, String senha) {

	public Authentication toAuthetication() {
	
		return new UsernamePasswordAuthenticationToken(email, senha);
	}

}
