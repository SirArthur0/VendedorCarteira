package com.scan.carteiravendedor.VendedorCarteira.model.repositories;

import org.springframework.data.repository.CrudRepository;
import com.scan.carteiravendedor.VendedorCarteira.model.entities.Carteira;

public interface CarteiraRepository extends CrudRepository<Carteira, Long>{

}
