package br.com.deGraoEmGrao.models;

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
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "")
public class Entregador {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotBlank
  @Size(min = 3, max = 50)
  private String nome;

  @NotBlank
  @Size(min = 11, max = 11)
  private String cpf;

  @NotBlank
  @Size(min = 8, max = 50)
  @Email
  private String email;

  @NotBlank
  private String senha;

  @NotBlank
  @Size(min = 10 , max =11)
  private String telefone;

}
