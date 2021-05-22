package com.rodizio.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.rodizio.crm.model.UsuarioId;


@Entity
public class Veiculos {
	
	/*@ManyToOne
	//private Usuario usuario;
	private List<Usuario> usuario;
	@targetEntity*/


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
		
	@Column (nullable = false)
	private String cpfUsuario;
	
	@Column (nullable = false)
	private String Marca;
	
	/*@Column (nullable = false)
	private String codMarca;*/
	
	@Column (nullable = false)
	private String Modelo;
	
	/*@Column (nullable = false)
	private String codModelo;*/
	
	@Column (nullable = false)
	private String Ano;
	
	/*@Column (nullable = false)
	private String codAno;*/
	
	/*@Column
	private String valorCarro;
	
	@Column
	private String DiaRodizio;
	
	@Column
	private boolean RodizioAtivo;*/
	
	/*public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}*/


	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}

	
	public String getcpfUsuario() {
		return cpfUsuario;
	}
	public void setcpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}


	public String getMarca() {
		return this.Marca;
	}
	public void setMarca(String marca) {
		this.Marca = marca;
	}

	
	public String getModelo() {
		return this.Modelo;
	}
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}

	
	public String getAno() {
		return this.Ano;
	}
	public void setAno(String ano) {
		this.Ano = ano;
	}

}
