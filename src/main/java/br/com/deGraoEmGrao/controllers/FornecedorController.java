package br.com.deGraoEmGrao.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
import br.com.deGraoEmGrao.models.Fornecedor;
import br.com.deGraoEmGrao.repository.FornecedorRepository;

@RestController
@RequestMapping("/degraoemgrao/fornecedores")
public class FornecedorController {

Logger log = LoggerFactory.getLogger(getClass());

  @Autowired
  FornecedorRepository repository;

  @GetMapping
  public List<Fornecedor> getAll(){
    return repository.findAll();
  }

  @PostMapping
  public ResponseEntity<Fornecedor> create(@RequestBody Fornecedor fornecedor){
    log.info("Cadastrando fornecedor" + fornecedor);
    repository.save(fornecedor);
    return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
  }

  @GetMapping("{id}")
  public ResponseEntity<Fornecedor> show(@PathVariable Integer id){
    log.info("Buscando um fornecedor com o id" + id);
    return ResponseEntity.ok(getFornecedor(id));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Fornecedor> delete(@PathVariable Integer id){
    log.info("Deletando o fornecedor com o id " + id);
    repository.delete(getFornecedor(id));
    return ResponseEntity.noContent().build();
  }

  @PutMapping("{id}")
  public ResponseEntity<Fornecedor> update(@PathVariable Integer id, @RequestBody Fornecedor fornecedor){
    log.info("Atualizando o fornecedor com o id" + id);
    getFornecedor(id);
    fornecedor.setId(id);
    repository.save(fornecedor);
    return ResponseEntity.ok(fornecedor);
  }

  private Fornecedor getFornecedor(Integer id){
    return repository.findById(id)
    .orElseThrow(() -> new RestNotFoundException("Fornecedor não cadastrado"));
  }
}