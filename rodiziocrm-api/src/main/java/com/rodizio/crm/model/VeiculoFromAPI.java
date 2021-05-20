package com.rodizio.crm.model;

public class VeiculoFromAPI {
	
	private String Valor;
	private String Marca;
	private String Modelo;
	private int AnoModelo;
	private String Combustivel;
	private String CodigoFipe;
	private String MesReferencia;
	private int TipoVeiculo;
	private String SiglaCombustivel;
	
	public VeiculoFromAPI() {
		
	}
	
	public VeiculoFromAPI(String valor, String marca, String modelo, int anoModelo, String combustivel,
			String codigoFipe, String mesReferencia, int tipoVeiculo, String siglaCombustivel) {
		super();
		Valor = valor;
		Marca = marca;
		Modelo = modelo;
		AnoModelo = anoModelo;
		Combustivel = combustivel;
		CodigoFipe = codigoFipe;
		MesReferencia = mesReferencia;
		TipoVeiculo = tipoVeiculo;
		SiglaCombustivel = siglaCombustivel;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
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
	public int getAnoModelo() {
		return AnoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		AnoModelo = anoModelo;
	}
	public String getCombustivel() {
		return Combustivel;
	}
	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}
	public String getCodigoFipe() {
		return CodigoFipe;
	}
	public void setCodigoFipe(String codigoFipe) {
		CodigoFipe = codigoFipe;
	}
	public String getMesReferencia() {
		return MesReferencia;
	}
	public void setMesReferencia(String mesReferencia) {
		MesReferencia = mesReferencia;
	}
	public int getTipoVeiculo() {
		return TipoVeiculo;
	}
	public void setTipoVeiculo(int tipoVeiculo) {
		TipoVeiculo = tipoVeiculo;
	}
	public String getSiglaCombustivel() {
		return SiglaCombustivel;
	}
	public void setSiglaCombustivel(String siglaCombustivel) {
		SiglaCombustivel = siglaCombustivel;
	}
}
