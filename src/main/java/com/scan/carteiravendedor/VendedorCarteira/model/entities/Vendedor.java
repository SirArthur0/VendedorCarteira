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
@Table(name = "vendedor")
public class Vendedor{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Por favor, preencha o nome do vendedor.")
	@NotNull(message = "O campo nome não pode ser nulo.")
	@Column(length = 155, nullable = false, unique = true)
	private String nome;
	
	@NotBlank(message = "Por favor, preencha o e-mail do vendedor.")
	@NotNull(message = "O valor do campo e-mail não pode ser nulo.")
	@Column(length = 40, nullable = false, unique = true)
	private String email;
	
	
	public Vendedor() {
	
	}
	
	public Vendedor(String nome, String email) {
		this.nome = nome;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}