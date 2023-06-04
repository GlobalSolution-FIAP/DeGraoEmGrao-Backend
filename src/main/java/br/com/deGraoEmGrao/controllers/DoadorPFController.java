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
import br.com.deGraoEmGrao.models.DoadorPF;
import br.com.deGraoEmGrao.repository.DoadorPFRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/degraoemgrao/doadorPF")
public class DoadorPFController {

	Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	DoadorPFRepository repository;

	@GetMapping
	public Page<DoadorPF> getAll(@RequestParam(required = false) String nome,
			@PageableDefault(size = 5) Pageable pageable) {

		if (nome == null)
			return repository.findAll(pageable);

		return repository.findByNomeContaining(nome, pageable);
	}

	@PostMapping
	public ResponseEntity<DoadorPF> create(@RequestBody @Valid DoadorPF doadorPF) {
		log.info("Cadastrando doadorPF" + doadorPF);
		repository.save(doadorPF);
		return ResponseEntity.status(HttpStatus.CREATED).body(doadorPF);
	}

	@GetMapping("{id}")
	public ResponseEntity<DoadorPF> show(@PathVariable Integer id) {
		log.info("Buscando um doadorPF com o id" + id);
		return ResponseEntity.ok(getDoadorPF(id));
	}

	@DeleteMapping("{id}")
	public ResponseEntity<DoadorPF> delete(@PathVariable Integer id) {
		log.info("Deletando o doadorPF com o id " + id);
		repository.delete(getDoadorPF(id));
		return ResponseEntity.noContent().build();
	}

	@PutMapping("{id}")
	public ResponseEntity<DoadorPF> update(@PathVariable Integer id, @RequestBody @Valid DoadorPF doadorPF) {
		log.info("Atualizando o doadorPF com o id" + id);
		getDoadorPF(id);
		doadorPF.setId(id);
		repository.save(doadorPF);
		return ResponseEntity.ok(doadorPF);
	}

	private DoadorPF getDoadorPF(Integer id) {
		return repository.findById(id).orElseThrow(() -> new RestNotFoundException("doadorPF não cadastrado"));
	}
}
