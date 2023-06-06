package br.com.deGraoEmGrao.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_GRAO_ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENDERECO")
	private Integer id;

	@NotBlank
	@Size(min = 3, max = 80)
	@Column(name = "DS_LOGRADOURO")
	private String logradouro;

	@NotBlank
	@Size(min = 1, max = 50)
	@Column(name = "NR_NUMERO")
	private String numero;

	@Column(name = "DS_COMPLEMENTO")
	private String complemento;

	@NotBlank
	@Size(min = 2, max = 50)
	@Column(name = "NM_BAIRRO")
	private String bairro;

	@NotBlank
	@Size(min = 8, max = 8)
	@Column(name = "NR_CEP")
	private String cep;

	@NotBlank
	@Size(min = 2, max = 50)
	@Column(name = "NM_CIDADE")
	private String cidade;

	@NotBlank
	@Size(min = 2, max = 5)
	@Column(name = "NM_ESTADO")
	private String estado;

	@NotBlank
	@Size(min = 2, max = 30)
	@Column(name = "NM_PAIS")
	private String pais;

}
