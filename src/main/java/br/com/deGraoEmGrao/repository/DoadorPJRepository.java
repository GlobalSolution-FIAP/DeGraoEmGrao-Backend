package br.com.deGraoEmGrao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.deGraoEmGrao.models.DoadorPJ;

public interface DoadorPJRepository extends JpaRepository<DoadorPJ, Integer> {

	Page<DoadorPJ> findByNomeContaining(String nome, Pageable pageable);
}
