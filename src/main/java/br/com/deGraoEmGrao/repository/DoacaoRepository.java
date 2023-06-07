package br.com.deGraoEmGrao.repository;

import java.util.Calendar;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.deGraoEmGrao.models.Categoria;
import br.com.deGraoEmGrao.models.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Integer> {
	
	Page<Doacao> findByNomeContaining(String nome, Pageable pageable);
	
	@Query("SELECT d FROM Doacao d WHERE d.nome = :nome")
	List<Doacao> findByNome(@Param("nome")String nome);
	
	@Query("SELECT d FROM Doacao d WHERE d.categoria = :categoria")
	List<Doacao> findByCategoria(@Param("categoria")Categoria categoria);
	
	@Query("SELECT d FROM Doacao d WHERE d.status = :status")
	List<Doacao> findByStatus(@Param("status") Boolean status);
	
	

}
