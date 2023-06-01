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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.deGraoEmGrao.exception.RestNotFoundException;
import br.com.deGraoEmGrao.models.Ong;
import br.com.deGraoEmGrao.repository.OngRepository;

@RestController
@RequestMapping("/degraoemgrao/ongs")
public class OngController {

  Logger log = LoggerFactory.getLogger(getClass());

  @Autowired
  OngRepository repository;

  @GetMapping
  public List<Ong> getAll(){
    return repository.findAll();
  }

  @PostMapping
  public ResponseEntity<Ong> create(@RequestBody Ong ong){
    log.info("Cadastrando a ong " + ong);
    repository.save(ong);
    return ResponseEntity.status(HttpStatus.CREATED).body(ong);

  }

  @GetMapping("{id}")
  public ResponseEntity<Ong> show(@PathVariable Integer id){
    log.info("Buscando a Ong com o id " + id);
    return ResponseEntity.ok(getOng(id));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Ong> delete(@PathVariable Integer id){
    log.info("Deletando a Ong com o id " + id);
    repository.delete(getOng(id));
    return ResponseEntity.noContent().build();
  }

  private Ong getOng(Integer id){
    return repository.findById(id)
    .orElseThrow(() -> new RestNotFoundException("Ong não cadastrado"));

  }
}
