package com.scan.carteiravendedor.VendedorCarteira.model.repositories;

import org.springframework.data.repository.CrudRepository;
import com.scan.carteiravendedor.VendedorCarteira.model.entities.Revenda;

public interface RevendaRepository extends CrudRepository<Revenda, Long>{
	
	
	public Iterable<Revenda> findByNomeContainingIgnoreCase(String nome);

}
