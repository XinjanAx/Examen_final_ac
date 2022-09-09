package com.example.demo.examen.modelo;

public class BuscarVueloTo {
	
	private String origen;
	private String destino;
	private String fechaD;
	private String fechaM;
	private String fechaA;

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

	public String getFechaD() {
		return fechaD;
	}

	public void setFechaD(String fechaD) {
		this.fechaD = fechaD;
	}

	public String getFechaM() {
		return fechaM;
	}

	public void setFechaM(String fechaM) {
		this.fechaM = fechaM;
	}

	public String getFechaA() {
		return fechaA;
	}

	public void setFechaA(String fechaA) {
		this.fechaA = fechaA;
	}

	@Override
	public String toString() {
		return "Vuelo - origen: " + origen + ", destino: " + destino + ", fecha:" + fechaD +"/"+ fechaM +"/"+ fechaA;
	}

}
