package br.com.deGraoEmGrao.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class DoadorPF {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "")
  private Integer id;

  @NotBlank
  @Size(min = 3, max = 50)
  @Column(name = "")
  private String nome;

  @NotBlank
  @Size(min = 11, max = 11)
  @Column(name = "")
  private String cpf;

  @NotBlank
  @Size(min = 10 , max = 11)
  @Column(name = "")
  private String telefone;

  @NotBlank
  @Size(min = 8, max = 50)
  @Email
  @Column(name = "")
  private String email;

  @NotBlank
  @Column(name = "")
  private String senha;
  
  @ManyToOne
  private Endereco endereco;
 
}
