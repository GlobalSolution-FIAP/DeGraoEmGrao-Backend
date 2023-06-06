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
import br.com.deGraoEmGrao.models.Endereco;
import br.com.deGraoEmGrao.repository.EnderecoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/degraoemgrao/endereco")
public class EnderecoController {

	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	EnderecoRepository repository;

	@GetMapping
	public List<Endereco> getAll() {
		return repository.findAll();
	}

	@PostMapping
	public ResponseEntity<Endereco> create(@RequestBody @Valid Endereco endereco) {
		log.info("Cadastrando Endereco" + endereco);
		repository.save(endereco);
		return ResponseEntity.status(HttpStatus.CREATED).body(endereco);
	}

	@GetMapping("{id}")
	public ResponseEntity<Endereco> show(@PathVariable Integer id) {
		log.info("Buscando um Endereco com o id" + id);
		return ResponseEntity.ok(getEndereco(id));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Endereco> delete(@PathVariable Integer id) {
		log.info("Deletando o Endereco com o id " + id);
		repository.delete(getEndereco(id));
		return ResponseEntity.noContent().build();
	}

	@PutMapping("{id}")
	public ResponseEntity<Endereco> update(@PathVariable Integer id, @RequestBody @Valid Endereco endereco) {
		log.info("Atualizando o Endereco com o id" + id);
		getEndereco(id);
		endereco.setId(id);
		repository.save(endereco);
		return ResponseEntity.ok(endereco);
	}

	private Endereco getEndereco(Integer id) {
		return repository.findById(id).orElseThrow(() -> new RestNotFoundException("Endereco não cadastrado"));
	}
}
