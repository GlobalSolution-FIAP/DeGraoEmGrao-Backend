package br.com.deGraoEmGrao.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotBlank
  @Size(min = 3, max = 80)
  private String logradouro;

  @NotBlank
  @Size(min = 1, max = 50)
  private String numero;

  private String complemento;

  @NotBlank
  @Size(min = 2, max = 50)
  private String bairro;

  @NotBlank
  @Size(min = 8, max = 8)
  private String cep;

  @NotBlank
  @Size(min = 2, max = 50)
  private String cidade;

  @NotBlank
  @Size(min = 2, max = 5)
  private String estado;

  @NotBlank
  @Size(min = 2, max = 30)
  private String pais;
}
