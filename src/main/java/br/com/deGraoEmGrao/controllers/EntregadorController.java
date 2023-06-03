package br.com.deGraoEmGrao.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.deGraoEmGrao.exception.RestNotFoundException;
import br.com.deGraoEmGrao.models.Entregador;
import br.com.deGraoEmGrao.repository.EntregadorRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/degraoemgrao/entregador")
public class EntregadorController {

  Logger log = LoggerFactory.getLogger(getClass());

  @Autowired
  EntregadorRepository repository;

  @GetMapping
  public List<Entregador> getAll(){
    return repository.findAll();
  }

  @PostMapping
  public ResponseEntity<Entregador> create(@RequestBody @Valid Entregador entregador){
    log.info("Cadastrando Entregador" + entregador);
    repository.save(entregador);
    return ResponseEntity.status(HttpStatus.CREATED).body(entregador);
  }

  @GetMapping("{id}")
  public ResponseEntity<Entregador> show(@PathVariable Integer id){
    log.info("Buscando um Entregador com o id" + id);
    return ResponseEntity.ok(getEntregador(id));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Entregador> delete(@PathVariable Integer id){
    log.info("Deletando o Entregador com o id " + id);
    repository.delete(getEntregador(id));
    return ResponseEntity.noContent().build();
  }

  @PutMapping("{id}")
  public ResponseEntity<Entregador> update(@PathVariable Integer id, @RequestBody @Valid Entregador entregador){
    log.info("Atualizando o Entregador com o id" + id);
    getEntregador(id);
    entregador.setId(id);
    repository.save(entregador);
    return ResponseEntity.ok(entregador);
  }

  private Entregador getEntregador(Integer id){
    return repository.findById(id)
    .orElseThrow(() -> new RestNotFoundException("Entregador não cadastrado"));
  }
}
