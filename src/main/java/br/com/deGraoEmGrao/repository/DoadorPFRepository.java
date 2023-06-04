package br.com.deGraoEmGrao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.deGraoEmGrao.models.DoadorPF;

public interface DoadorPFRepository extends JpaRepository<DoadorPF, Integer> {

	Page<DoadorPF> findByNomeContaining(String nome, Pageable ageable);
}
