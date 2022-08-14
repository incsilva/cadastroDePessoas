package br.edu.ifrn.jc.cadastro;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.edu.ifrn.jc.cadastro.dominio.Pessoa;
import br.edu.ifrn.jc.cadastro.dominio.PessoaRepositorio;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {

	@Autowired
	private PessoaRepositorio pessoaRepo;

	@Override
	public void run(String... args) throws Exception {

		Pessoa p1 = new Pessoa("Alberi");
		p1.setDataNascimento(LocalDate.of(2002, 9, 16));
		p1.setEmail("silva.inacio@escolar.ifrn.edu.br");

		Pessoa p2 = new Pessoa("Ana");
		p2.setDataNascimento(LocalDate.of(2009, 6, 26));
		p2.setEmail("ana@gmail.com");

		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
	}

}
