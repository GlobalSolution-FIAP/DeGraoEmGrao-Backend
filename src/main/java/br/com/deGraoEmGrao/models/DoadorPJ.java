package br.com.deGraoEmGrao.models;

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
@Table(name = "TB_DOADOR_PJ")
public class DoadorPJ {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOADOR_PJ")
	private Integer id;

	@NotBlank
	@Size(min = 3, max = 50)
	@Column(name = "NM_DOADOR")
	private String nome;

	@NotBlank
	@Size(min = 14, max = 14)
	@Column(name = "NR_CNPJ")
	private String cnpj;

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

	@NotBlank
	@Size(min = 3, max = 50)
	@Column(name = "NM_RESPONSAVEL")
	private String responsavel;

	@NotBlank
	@Size(min = 10, max = 11)
	@Column(name = "NR_TELEFONE_RESPONSAVEL")
	private String telResponsavel;

	@ManyToOne
	private Endereco endereco;
}
