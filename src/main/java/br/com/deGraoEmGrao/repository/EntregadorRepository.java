package br.com.deGraoEmGrao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.deGraoEmGrao.models.Entregador;

public interface EntregadorRepository extends JpaRepository<Entregador, Integer> {

	Page<Entregador> findByNomeContaining(String nome, Pageable pageable);
}
