package br.com.deGraoEmGrao.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_GRAO_ENTREGADOR")
public class Entregador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENTREGADOR")
	private Integer id;

	@NotBlank
	@Size(min = 3, max = 50)
	@Column(name = "NM_ENTREGADOR")
	private String nome;

	@NotBlank
	@Size(min = 11, max = 11)
	@Column(name = "NR_CPF")
	private String cpf;

	@NotBlank
	@Size(min = 8, max = 50)
	@Email
	@Column(name = "DS_EMAIL")
	private String email;

	@NotBlank
	@Column(name = "DS_SENHA")
	private String senha;

	@NotBlank
	@Size(min = 10, max = 11)
	@Column(name = "NR_TELEFONE")
	private String telefone;

}
