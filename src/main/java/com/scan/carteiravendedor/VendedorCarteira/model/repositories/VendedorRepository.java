package com.scan.carteiravendedor.VendedorCarteira.model.repositories;

import org.springframework.data.repository.CrudRepository;
import com.scan.carteiravendedor.VendedorCarteira.model.entities.Vendedor;

public interface VendedorRepository extends CrudRepository<Vendedor, Long>{

}
