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
	
	@Column(length = 6, nullable = true, unique = true)
	private int mpn;
	
	@NotBlank(message = "Por favor, preencha o desconto da revenda. Caso a revenda não tenha desconto, preencha 0%")
	@NotNull(message = "O campo desconto não pode ser nulo. Caso a revenda não tenha desconto, preencha 0%")
	@Column(nullable = false)
	private Double desconto;

	/*incluir data de cadastro*/
	
	
	public Revenda() {
		
	}
	
	public Revenda(String nome, String cnpj, int mpn) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.mpn = mpn;
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

	public int getMpn() {
		return mpn;
	}

	public void setMpn(int mpn) {
		this.mpn = mpn;
	}	
	
}