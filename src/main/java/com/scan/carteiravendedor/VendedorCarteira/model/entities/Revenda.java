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
	@NotNull(message = "Por favor, preencha o nome da revenda.")
	@Column(length = 155, nullable = false)
	private String nome;
	
	
	public Revenda() {
		
	}
	
	public Revenda(String nome) {
		this.nome = nome;
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
	
}
