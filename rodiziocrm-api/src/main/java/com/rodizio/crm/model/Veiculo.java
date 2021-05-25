package com.rodizio.crm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "VEICULO")
public class Veiculo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;
	
	@Column (nullable = false)
	private String Marca;

	@Column (nullable = false)
	private String Modelo;

	@Column (nullable = false)
	private String Ano;
	
	@Column
	private boolean diaRodizio;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

	public boolean isDiaRodizio() {
		return diaRodizio;
	}

	public void setDiaRodizio(boolean diaRodizio) {
		this.diaRodizio = diaRodizio;
	}

}