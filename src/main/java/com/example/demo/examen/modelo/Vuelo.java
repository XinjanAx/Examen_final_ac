package com.example.demo.examen.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {
	
	@Id
	@Column(name="vue_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_seq_id")
	@SequenceGenerator(name = "vue_seq_id", sequenceName = "vue_seq_id",allocationSize = 1)
	private Integer id;
	
	@Column(name="vue_numero")
	private String numero;
	
	@Column(name="vue_origen")
	private String origen;
	
	@Column(name="vue_destino")
	private String destino;
	
	@Column(name="vue_fecha_v")
	private LocalDateTime fechaVuelo;
	
	@Column(name="vue_asientos_dis")
	private Integer asientosD;
	
	@Column(name="vue_estado")
	private String estado;
	
	@Column(name="vue_valor_asiento")
	private BigDecimal valorAsiento;
	
	@OneToMany(mappedBy = "vuelo")
	private List<CompraPasaje> compraP;
	
	@ManyToOne
	@JoinColumn(name = "vue_avi_id")
	private Avion avion;

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

	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosD() {
		return asientosD;
	}

	public void setAsientosD(Integer asientosD) {
		this.asientosD = asientosD;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<CompraPasaje> getCompraP() {
		return compraP;
	}

	public void setCompraP(List<CompraPasaje> compraP) {
		this.compraP = compraP;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
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

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

}
