package br.com.deGraoEmGrao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.deGraoEmGrao.models.DoadorPF;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

public interface DoadorPFRepository extends JpaRepository<DoadorPF, Integer> {
	
	Page<DoadorPF> findByNomeContaining(String nome, Pageable ageable);

	Optional<DoadorPF> findByEmail(String email);
	
//	@Query("select d from DoadorPF d where d.nome = :nome")
//	public List<DoadorPF> buscaPorNome(String nome);
//	
//	@Query("select d from DoadorPF d where d.cpf = :cpf")
//	public List<DoadorPF> buscarPorCpf(String cpf);
	
}
