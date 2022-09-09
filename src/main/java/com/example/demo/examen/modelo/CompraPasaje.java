package com.example.demo.examen.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "compra_pasaje")
public class CompraPasaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "comp_seq_id")
	@SequenceGenerator(name = "comp_seq_id",sequenceName = "comp_seq_id",allocationSize = 1)
	@Column(name = "comp_id")
	private Integer id;
	
	@Column(name = "comp_numero")
	private String numero;
	
	@Column(name = "comp_fecha_c")
	private LocalDateTime fechaCom;
	
	@Column(name = "comp_num_tarjeta")
	private String numTarjeta;
	
	@Column(name = "comp_cantidad_asnts_compr")
	private Integer acientosComprados;
	
	@Column(name = "comp_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "comp_vue_id")
	private Vuelo vuelo;
	
	@ManyToOne
	@JoinColumn(name = "comp_cli_id")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCom() {
		return fechaCom;
	}

	public void setFechaCom(LocalDateTime fechaCom) {
		this.fechaCom = fechaCom;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public Integer getAcientosComprados() {
		return acientosComprados;
	}

	public void setAcientosComprados(Integer acientosComprados) {
		this.acientosComprados = acientosComprados;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
