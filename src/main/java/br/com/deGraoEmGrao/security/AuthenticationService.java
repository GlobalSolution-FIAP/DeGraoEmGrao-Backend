package br.com.deGraoEmGrao.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.deGraoEmGrao.repository.DoadorPFRepository;

//Classe que encontra os detalhes do usuário
@Service
public class AuthenticationService implements UserDetailsService{
	
	@Autowired
	DoadorPFRepository repository;
	
	  @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        return repository.findByEmail(username)
	            .orElseThrow(() -> new UsernameNotFoundException("usuário não encontrado"));
	    }
	
}
