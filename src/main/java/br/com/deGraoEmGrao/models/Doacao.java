package br.com.deGraoEmGrao.models;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "")
public class Doacao {

  @Id
  @Column(name = "")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @NotBlank
  @Size(min = 3, max = 50)
  @Column(name = "")
  private String nome;

  @Positive
  @Column(name = "")
  private Double quantidade;

  @Temporal(TemporalType.DATE)
  @Column(name = "")
  private Calendar dataValidade;

  @Enumerated(EnumType.STRING)
  @Column(name = "")
  private Categoria categoria;

  @NotBlank
  @Size(min = 3, max = 20)
  @Column(name = "")
  private String condicao;

  @Temporal(TemporalType.DATE)
  @Column(name = "")
  private Calendar dataEntrega;

  @Column(name = "")
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
