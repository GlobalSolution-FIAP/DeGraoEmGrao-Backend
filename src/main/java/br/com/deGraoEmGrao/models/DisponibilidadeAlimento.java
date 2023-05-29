package br.com.deGraoEmGrao.models;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisponibilidadeAlimento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String tipo;

  private String perecibilidade;

  private Calendar dataDisponibilidade;

  private Calendar prazoDoacao;

  private int quantidade;

}
