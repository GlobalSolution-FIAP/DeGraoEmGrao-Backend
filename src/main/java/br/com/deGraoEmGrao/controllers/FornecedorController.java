package br.com.deGraoEmGrao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.deGraoEmGrao.models.Fornecedor;
import br.com.deGraoEmGrao.repository.FornecedorRepository;

@RestController
public class FornecedorController {

  @Autowired
  FornecedorRepository repository;

  
}
