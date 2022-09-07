package com.scan.carteiravendedor.VendedorCarteira.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.scan.carteiravendedor.VendedorCarteira.model.entities.Carteira;
import com.scan.carteiravendedor.VendedorCarteira.model.repositories.CarteiraRepository;

@RestController
@RequestMapping("/carteira")
public class CarteiraController {
	
	@Autowired
	private CarteiraRepository cr;
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/cadastrar")
	public Carteira cadastroCarteira(@Valid Carteira carteira) {
		
		if(carteira != null) {
			cr.save(carteira);
			System.out.println("Carteira cadastrada com sucesso!!\n, "
									+ "ID carteira: " + carteira.getId() + ", \n"
									+ "revenda: " + carteira.getRevenda().getNome() + ", \n"
									+ "vendedor: " + carteira.getVendedor().getNome());
			
		}else {
			System.out.println("Por ");
		}
		
		return carteira;
	}
	
}
