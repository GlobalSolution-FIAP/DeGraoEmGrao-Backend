package br.com.deGraoEmGrao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.deGraoEmGrao.models.Ong;

public interface OngRepository extends JpaRepository<Ong, Integer> {

	Page<Ong> findByNomeContaining(String nome, Pageable pageable);
}
