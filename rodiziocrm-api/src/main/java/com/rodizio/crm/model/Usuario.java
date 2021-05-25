package com.rodizio.crm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {
		
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String nome;		
	
	@Column(nullable = false) 
	private String nascimento;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private List<Veiculo> veiculos;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
