package com.rodizio.crm.model;

import javax.persistence.*;

@Entity
@Table (name = "USUARIO")
public class Usuario {
	
	@EmbeddedId
	private UsuarioId id;
		
	@Column (nullable = false)
	private String nome;
	
	@Column (nullable = false) //not null
	private String nascimento;

	public UsuarioId getId() {
		return id;
	}

	public void setId(UsuarioId id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}



}
