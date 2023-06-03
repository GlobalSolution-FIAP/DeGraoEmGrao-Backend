package br.com.deGraoEmGrao.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ong {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotBlank
  @Size(min = 3, max = 50)
  private String nome;

  @NotBlank
  @Size(min = 14, max = 14)
  private String cnpj;

  @NotBlank
  @Size(min = 10 , max =11)
  private String telefone;

  @NotBlank
  @Size(min = 8, max = 50)
  @Email(message = "Email não é válido", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
  private String email;

  @NotBlank
  private String senha;

  @NotBlank
  private String responsavel;

  @NotBlank
  private String telResponsavel;
  
  @ManyToOne
  private Endereco endereco;
  
}
