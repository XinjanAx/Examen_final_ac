package com.example.demo.examen.modelo;


import java.math.BigDecimal;

public class VuelosDisponiblesTo{
	
	private String numVuelo;
	private String origen;
	private String destino;
	private String nombreAvion;
	private BigDecimal valorAs;
	
	
	public VuelosDisponiblesTo(String numVuelo, String origen, String destino, String nombreAvion,
			BigDecimal valorAs) {
		this.numVuelo = numVuelo;
		this.origen = origen;
		this.destino = destino;
		this.nombreAvion = nombreAvion;
		this.valorAs = valorAs;
	}
	public VuelosDisponiblesTo() {}
	
	public String getNumVuelo() {
		return numVuelo;
	}
	public void setNumVuelo(String numVuelo) {
		this.numVuelo = numVuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getNombreAvion() {
		return nombreAvion;
	}
	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}
	public BigDecimal getValorAs() {
		return valorAs;
	}
	public void setValorAs(BigDecimal valorAs) {
		this.valorAs = valorAs;
	}

}
