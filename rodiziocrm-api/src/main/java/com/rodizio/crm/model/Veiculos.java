package com.rodizio.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Veiculos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column (nullable = false)
	private String Marca;
	
	@Column (nullable = false)
	private String codMarca;
	
	@Column (nullable = false)
	private String Modelo;
	
	@Column (nullable = false)
	private String codModelo;
	
	@Column (nullable = false)
	private String Ano;
	
	@Column (nullable = false)
	private String codAno;
	
	@Column
	private String valorCarro;

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

	public String getValorCarro() {
		return valorCarro;
	}

	public void setValorCarro(String valorCarro) {
		this.valorCarro = valorCarro;
	}

	public String getCodMarca() {
		return codMarca;
	}

	public void setCodMarca(String codMarca) {
		this.codMarca = codMarca;
	}

	public String getCodModelo() {
		return codModelo;
	}

	public void setCodModelo(String codModelo) {
		this.codModelo = codModelo;
	}

	public String getCodAno() {
		return codAno;
	}

	public void setCodAno(String codAno) {
		this.codAno = codAno;
	}
	
	
}
