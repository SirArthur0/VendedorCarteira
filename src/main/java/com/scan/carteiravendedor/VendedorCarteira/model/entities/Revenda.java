package com.scan.carteiravendedor.VendedorCarteira.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "revenda")
public class Revenda{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Por favor, preencha o nome da revenda.")
	@NotNull(message = "O campo nome não pode ser nulo.")
	@Column(length = 155, nullable = false)
	private String nome;
	
	@NotBlank(message = "Por favor, preencha o CNPJ da revenda.")
	@NotNull(message = "O campo CNPJ não pode ser nulo.")
	@Column(length = 18, nullable = false, unique = true)
	private String cnpj;
	 
	@Column(length = 8, nullable = true, unique = true)
	private Integer mpn;
	
	@NotNull(message = "O campo desconto não pode ser nulo. Caso a revenda não tenha desconto, preencha 0%")
	private Double desconto;

	/*incluir data de cadastro*/
	
	
	public Revenda() {
		
	}
	 
	public Revenda(String nome, String cnpj, Integer mpn, Double desconto) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.mpn = mpn;
		this.desconto = desconto;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getMpn() {
		return mpn;
	}

	public void setMpn(Integer mpn) {
		this.mpn = mpn;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}	
	
	
	
}