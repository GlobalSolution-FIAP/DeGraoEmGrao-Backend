package br.com.deGraoEmGrao.models;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_GRAO_DOADOR_PF")
public class DoadorPF implements UserDetails{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOADOR_PF")
	private Integer id;

	@NotBlank
	@Size(min = 3, max = 50)
	@Column(name = "NM_DOADOR")
	private String nome;

	@NotBlank
	@Size(min = 11, max = 11)
	@Column(name = "NR_CPF")
	private String cpf;

	@NotBlank
	@Size(min = 10, max = 11)
	@Column(name = "NR_TELEFONE")
	private String telefone;

	@NotBlank
	@Size(min = 8, max = 50)
	@Email
	@Column(name = "DS_EMAIL")
	private String email;

	@NotBlank
	@Column(name = "DS_SENHA")
	private String senha;

	@ManyToOne
	private Endereco endereco;

	//Retorna quais os papeis do usuário
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority("ROLE_DOADORPF"));
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
