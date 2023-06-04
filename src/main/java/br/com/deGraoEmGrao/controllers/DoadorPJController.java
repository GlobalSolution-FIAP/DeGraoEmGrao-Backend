package br.com.deGraoEmGrao.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.deGraoEmGrao.exception.RestNotFoundException;
import br.com.deGraoEmGrao.models.DoadorPJ;
import br.com.deGraoEmGrao.repository.DoadorPJRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/degraoemgrao/doadorPJ")
public class DoadorPJController {

	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	DoadorPJRepository repository;

	@GetMapping
	public Page<DoadorPJ> getAll(@RequestParam(required = false) String nome,
			@PageableDefault(size = 5) Pageable pageable) {

		if (nome == null)
			return repository.findAll(pageable);

		return repository.findByNomeContaining(nome, pageable);
	}

	@PostMapping
	public ResponseEntity<DoadorPJ> create(@RequestBody @Valid DoadorPJ doadorPJ) {
		log.info("Cadastrando doadorPJ" + doadorPJ);
		repository.save(doadorPJ);
		return ResponseEntity.status(HttpStatus.CREATED).body(doadorPJ);
	}

	@GetMapping("{id}")
	public ResponseEntity<DoadorPJ> show(@PathVariable Integer id) {
		log.info("Buscando um doadorPJ com o id" + id);
		return ResponseEntity.ok(getDoadorPJ(id));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<DoadorPJ> delete(@PathVariable Integer id) {
		log.info("Deletando o doadorPJ com o id " + id);
		repository.delete(getDoadorPJ(id));
		return ResponseEntity.noContent().build();
	}

	@PutMapping("{id}")
	public ResponseEntity<DoadorPJ> update(@PathVariable Integer id, @RequestBody @Valid DoadorPJ doadorPJ) {
		log.info("Atualizando o doadorPJ com o id" + id);
		getDoadorPJ(id);
		doadorPJ.setId(id);
		repository.save(doadorPJ);
		return ResponseEntity.ok(doadorPJ);
	}

	private DoadorPJ getDoadorPJ(Integer id) {
		return repository.findById(id).orElseThrow(() -> new RestNotFoundException("doadorPJ não cadastrado"));
	}
}