package com.rodizio.crm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
//@IdClass(UsuarioId.class)
public class Usuario implements Serializable {
	
	@EmbeddedId
	private UsuarioId Id = new UsuarioId();
		
	@Column(nullable = false)
	private String nome;		
	
	@Column(nullable = false) //not null
	private String nascimento;
	
	/*@OneToMany
	private List<Veiculos> veiculos;*/

	public UsuarioId getId() {
		return Id;
	}

	public void setId(UsuarioId id) {
		this.Id = id;
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

	/*public List<Veiculos> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculos> veiculos) {
		this.veiculos = veiculos;
	}*/



}
