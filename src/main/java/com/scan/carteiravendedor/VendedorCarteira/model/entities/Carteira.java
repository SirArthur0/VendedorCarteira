package com.scan.carteiravendedor.VendedorCarteira.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carteira")
public class Carteira {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Vendedor vendedor;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Revenda revenda;


	public Carteira() {
		
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Revenda getRevenda() {
		return revenda;
	}

	public void setRevenda(Revenda revenda) {
		this.revenda = revenda;
	}
	
}