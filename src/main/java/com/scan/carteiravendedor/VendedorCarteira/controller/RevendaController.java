package com.scan.carteiravendedor.VendedorCarteira.controller;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.scan.carteiravendedor.VendedorCarteira.model.entities.Revenda;
import com.scan.carteiravendedor.VendedorCarteira.model.repositories.RevendaRepository;

@RestController
@RequestMapping("/revenda")
public class RevendaController {

	@Autowired
	private RevendaRepository rr;
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
	public Revenda cadastroRevenda(@Valid Revenda revenda) {
		
		if(revenda.getNome() != null) {
			rr.save(revenda);
			System.out.println("Revenda " + revenda.getNome() + " cadastrado com sucesso!");
		} else {
			System.out.println("Por favor, digite os dados corretamente.");
		}
		
		return revenda;
		 
	}
	
	@GetMapping("/todos")
	public Iterable<Revenda> obterTodos(){
		return rr.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Revenda> obterPorId(@PathVariable long id){
		return rr.findById(id);
	}
		
	
	@GetMapping(path = "/nome/{nome}")
	public Iterable<Revenda> obterPorNome(@PathVariable String nome){
		return rr.findByNomeContainingIgnoreCase(nome);
	}
	
	@GetMapping(path = "/cnpj/{cnpj}")
	public Iterable<Revenda> obterPorDesconto(@PathVariable String cnpj){
		return rr.findByCnpjContainingIgnoreCase(cnpj);
	}
	
	@GetMapping(path = "/desconto/{desconto}")
	public Iterable<Revenda> obterPorDesconto(@PathVariable Double desconto){
		return rr.findByDesconto(desconto);
	}
	
	@PutMapping
	public Revenda alterarRevenda(@Valid Revenda revenda) {
		rr.save(revenda);
		return revenda;
	}
	

}
