package br.com.deGraoEmGrao.config;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.deGraoEmGrao.models.Categoria;
import br.com.deGraoEmGrao.models.Doacao;
import br.com.deGraoEmGrao.models.DoadorPF;
import br.com.deGraoEmGrao.models.DoadorPJ;
import br.com.deGraoEmGrao.models.Endereco;
import br.com.deGraoEmGrao.models.Entregador;
import br.com.deGraoEmGrao.models.Ong;
import br.com.deGraoEmGrao.repository.DoacaoRepository;
import br.com.deGraoEmGrao.repository.DoadorPFRepository;
import br.com.deGraoEmGrao.repository.DoadorPJRepository;
import br.com.deGraoEmGrao.repository.EnderecoRepository;
import br.com.deGraoEmGrao.repository.EntregadorRepository;
import br.com.deGraoEmGrao.repository.OngRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner{
	
	@Autowired
	EnderecoRepository enderecoRepostory;

	@Autowired
	DoadorPFRepository doadorPFRepository;
	
	@Autowired
	DoadorPJRepository doadorPJRepository;
	
	@Autowired
	OngRepository ongReposity;
	
	@Autowired
	EntregadorRepository entregadorRepository;
	
	@Autowired
	DoacaoRepository doacaoRepository;
	
	public void run(String... args) throws Exception {
		Endereco end1 = new Endereco(1, "Av. do Taboão", "2754", "Apto-25", "Taboão", "09655000", "São Paulo", "SP", "Brasil");
		Endereco end2 = new Endereco(2, "Rua Bernardo Leite", "806", "", "Suisso", "04532785", "Santo Andre", "SP", "Brasil");
		Endereco end3 = new Endereco(3, "Travessa Algostino", "25", "Casa2", "Vila Nova", "29584235", "São Caetano", "SP", "Brasil");
		Endereco end4 = new Endereco(4, "Rod. Raposo", "s/n", "Lote5", "Dom Vilares", "74582222", "São Paulo", "SP", "Brasil");
		Endereco end5 = new Endereco(5, "Rua Santana", "5000", "Box3", "Ipiranga", "65557414", "São Paulo", "SP", "Brasil");
		Endereco end6 = new Endereco(6, "Rua Atibaia", "471", "", "São Bento", "08544220", "São Paulo", "SP", "Brasil");
		Endereco end7 = new Endereco(7, "Av. Brasil", "8521", "", "Jussara", "44755412", "São Caetano do Sul", "SP", "Brasil");
		
		enderecoRepostory.saveAll(List.of(end1, end2, end3, end4, end5, end6, end7));
		
		DoadorPF pf1 = new DoadorPF(1, "Maria Cardoso", "25428753614", "11947521358", "maria@email.com", "m12345", end1);
		DoadorPF pf2 = new DoadorPF(2, "José Pereira", "47521638954", "1141257496", "jose@email.com", "j12345", end2);
		DoadorPF pf3 = new DoadorPF(3, "Luiza Tokuhara", "24515422454", "11957841158", "luiza@email.com", "l12345", end3);
		
		doadorPFRepository.saveAll(List.of(pf1, pf2, pf3));
		
		DoadorPJ pj1 = new DoadorPJ(1, "Restaurante Baiano", "07033410000150", "1155781245", "contato@restaurantebaiano.com.br", "rb9876", "Solange Alves", "11995782121", end4);
		DoadorPJ pj2 = new DoadorPJ(2, "Sacolão Paraiso", "45255781000152", "1144251212", "contato@sacolaoparaiso.com.br", "sp47125", "Evandro Pires", "11964751214", end5);
		
		doadorPJRepository.saveAll(List.of(pj1, pj2));
		
		Ong ong1 = new Ong(1, "Refeição do Bem", "09688210000142", "1158582020", "contato@refeicaodobem.com.br", "ob14785", "Ana Cristina", "11994715252", end6);
		Ong ong2 = new Ong(2, "Noite Sem Fome", "71725425001260", "1141785050", "contato@noitesemfome.com.br", "nsf96385", "Nicolas Penteado", "11992547485", end7);
		
		ongReposity.saveAll(List.of(ong1, ong2));
		
		Entregador e1 = new Entregador(1, "Alex Freitas", "52415714102", "alexf@ail.com", "af7458", "11995422512");
		Entregador e2 = new Entregador(2, "Sandra Cabianca", "63252314852", "sandra@ail.com", "sc2541", "11962517985");
		Entregador e3 = new Entregador(3, "Caio Brito", "52896945832", "caio@ail.com", "cb85475", "11997958469");
		
		entregadorRepository.saveAll(List.of(e1, e2, e3));
		
		doacaoRepository.saveAll(List.of(
			Doacao.builder().nome("Carne bovina").quantidade(2.550).dataValidade(new GregorianCalendar(2023, Calendar.JUNE, 6))
			.categoria(Categoria.CARNES).condicao("fresco").dataEntrega(Calendar.getInstance())
			.status(false).doadorPF(pf1).ong(ong1).entregador(e1).build(),
			Doacao.builder().nome("Peixe").quantidade(0.800).dataValidade(new GregorianCalendar(2023, Calendar.JUNE, 6))
			.categoria(Categoria.CARNES).condicao("fresco").dataEntrega(Calendar.getInstance())
			.status(false).doadorPF(pf1).ong(ong1).entregador(e1).build(),
			Doacao.builder().nome("Chocolate").quantidade(1.000).dataValidade(new GregorianCalendar(2023, Calendar.JUNE, 6))
			.categoria(Categoria.DOCES).condicao("fresco").dataEntrega(Calendar.getInstance())
			.status(false).doadorPJ(pj1).ong(ong1).entregador(e1).build(),
			Doacao.builder().nome("Banana").quantidade(3.000).dataValidade(new GregorianCalendar(2023, Calendar.JUNE, 6))
			.categoria(Categoria.FRUTAS).condicao("fresco").dataEntrega(Calendar.getInstance())
			.status(false).doadorPJ(pj2).ong(ong2).entregador(e2).build(),
			Doacao.builder().nome("Batata").quantidade(2.000).dataValidade(new GregorianCalendar(2023, Calendar.JUNE, 6))
			.categoria(Categoria.LEGUMES).condicao("congelado").dataEntrega(Calendar.getInstance())
			.status(false).doadorPJ(pj2).ong(ong2).entregador(e2).build(),
			Doacao.builder().nome("Arroz").quantidade(10.000).dataValidade(new GregorianCalendar(2023, Calendar.JUNE, 6))
			.categoria(Categoria.PERECIVEL).condicao("perecivel").dataEntrega(Calendar.getInstance())
			.status(true).doadorPJ(pj2).ong(ong2).entregador(e3).build(),
			Doacao.builder().nome("Feijão").quantidade(10.000).dataValidade(new GregorianCalendar(2023, Calendar.JUNE, 6))
			.categoria(Categoria.PERECIVEL).condicao("perecivel").dataEntrega(Calendar.getInstance())
			.status(true).doadorPJ(pj2).ong(ong2).entregador(e3).build()
		));
	}
}
