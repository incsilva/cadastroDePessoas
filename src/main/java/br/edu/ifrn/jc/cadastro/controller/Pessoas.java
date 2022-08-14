package br.edu.ifrn.jc.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifrn.jc.cadastro.dominio.PessoaRepositorio;

@Controller
public class Pessoas {

	private PessoaRepositorio pessoaRepo;

	public Pessoas(PessoaRepositorio pessoaRepo) {
		this.pessoaRepo = pessoaRepo;
	}

	@GetMapping("/rh/pessoas")
	public String pessoas(Model model) {
		model.addAttribute("listaPessoas", pessoaRepo.findAll());
		return "rh/pessoas/index";
	}
}
