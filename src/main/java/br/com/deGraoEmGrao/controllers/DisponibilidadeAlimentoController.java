package br.com.deGraoEmGrao.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.deGraoEmGrao.models.DisponibilidadeAlimento;
import br.com.deGraoEmGrao.repository.DisponibilidadeAlimentoRepository;

@RestController
@RequestMapping("/degraoemgrao/disponibilidade")
public class DisponibilidadeAlimentoController {

  Logger log = LoggerFactory.getLogger(getClass());

  @Autowired
  DisponibilidadeAlimentoRepository repository;

  @GetMapping
  public List<DisponibilidadeAlimento> getAll(){
    return repository.findAll();
  }

  // public ResponseEntity<DisponibilidadeAlimento> create(@RequestBody DisponibilidadeAlimento dispAlimento){
  //   log.info("");

  // }
}
