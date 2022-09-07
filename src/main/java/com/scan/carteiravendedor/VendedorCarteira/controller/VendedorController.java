package com.scan.carteiravendedor.VendedorCarteira.controller;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.scan.carteiravendedor.VendedorCarteira.model.entities.Vendedor;
import com.scan.carteiravendedor.VendedorCarteira.model.repositories.VendedorRepository;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
	
	@Autowired
	private VendedorRepository vr;
	
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
	public Vendedor cadastroVendedor(@Valid Vendedor vendedor) {

		if(vendedor.getNome() != null) {
			vr.save(vendedor);
			System.out.println("Vendedor " + vendedor.getNome() + " cadastrado com sucesso!");
		}else {
			System.out.println("Preencha os dados corretamente.");
		}
		
		return vendedor;
		
	}
	
	
	@GetMapping(path = "/todos")
	public Iterable<Vendedor> obterTodos() {
		
		return vr.findAll();
		
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Vendedor> obterPorId(@PathVariable long id){
		
		return vr.findById(id);
		
	}
	
	@GetMapping(path = "/nome/{nome}")
	public Iterable<Vendedor> obterPorNome(@PathVariable String nome){
		return vr.findByNomeContainingIgnoreCase(nome);
	}
	
	
	
	
}
