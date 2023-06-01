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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.deGraoEmGrao.exception.RestNotFoundException;
import br.com.deGraoEmGrao.models.Alimento;
import br.com.deGraoEmGrao.repository.AlimentoRepository;

@RestController
@RequestMapping("/degraoemgrao/alimentos")
public class AlimentoController {

  Logger log = LoggerFactory.getLogger(getClass());

  @Autowired
  AlimentoRepository repository;

  @GetMapping
  private List<Alimento> getALl(){
    return repository.findAll();
  }

  @PostMapping
  public ResponseEntity<Alimento> create(@RequestBody Alimento alimento){
    log.info("Cadastrando o alimento " + alimento);
    repository.save(alimento);
    return ResponseEntity.status(HttpStatus.CREATED).body(alimento);
  }

  @GetMapping("{id}")
  public ResponseEntity<Alimento> show(@PathVariable Integer id){
    log.info("Buscando o alimento com o id " + id);
    return ResponseEntity.ok(getAlimento(id));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Alimento> delete(@PathVariable Integer id){
    log.info("Deletando o alimento com o id " + id);
    repository.delete(getAlimento(id));
    return ResponseEntity.noContent().build();
  }

  @PutMapping("{id}")
  public ResponseEntity<Alimento> update(@PathVariable Integer id, @RequestBody Alimento alimento){
    log.info("Alterando o alimento com o id" + id);
    getAlimento(id);
    alimento.setId(id);
    repository.save(alimento);
    return ResponseEntity.ok(alimento);
  }

  private Alimento getAlimento(Integer id){
    return repository.findById(id)
    .orElseThrow(() -> new RestNotFoundException("Alimento não cadastrado"));
  }
}
