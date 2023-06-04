package br.com.deGraoEmGrao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.deGraoEmGrao.models.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Integer> {

	Page<Doacao> findByNomeContaining(String nome, Pageable pageable);
}
