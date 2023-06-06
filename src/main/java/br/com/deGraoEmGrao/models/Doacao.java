package br.com.deGraoEmGrao.models;

import java.util.Calendar;

import org.springframework.hateoas.EntityModel;

import br.com.deGraoEmGrao.controllers.DoacaoController;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NamedQueries({
//	@NamedQuery(name = "Doacao.porNome", query = "select d from Doacao d where d.nome = :nome"),
//	@NamedQuery(name = "Doacao.porDoadoPF", query= "select d from Doacao d where d.doadorPF = :doadorPF")
//})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_GRAO_DOACAO")
public class Doacao {

	@Id
	@Column(name = "ID_DOACAO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	@Size(min = 3, max = 50)
	@Column(name = "NM_NOME")
	private String nome;

	@Positive
	@Column(name = "DS_QUANTIDADE")
	private Double quantidade;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_VALIDADE")
	private Calendar dataValidade;

	@Enumerated(EnumType.STRING)
	@Column(name = "DS_CATEGORIA")
	private Categoria categoria;

	@NotBlank
	@Size(min = 3, max = 20)
	@Column(name = "DS_CONDICAO")
	private String condicao;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_DATA_ENTREGA")
	private Calendar dataEntrega;

	@Column(name = "DS_STATUS")
	private Boolean status;

	@ManyToOne
	private DoadorPF doadorPF;

	@ManyToOne
	private DoadorPJ doadorPJ;

	@ManyToOne
	private Ong ong;

	@ManyToOne
	private Entregador entregador;

}
