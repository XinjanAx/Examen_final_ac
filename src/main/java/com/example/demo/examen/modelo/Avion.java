package com.example.demo.examen.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "av_seq_id")
	@SequenceGenerator(name = "av_seq_id",sequenceName = "av_seq_id",allocationSize = 1)
	@Column(name="av_id")
	private Integer avionId;
	
	@Column(name="av_nombre")
	private String nombre;
	
	@Column(name = "av_capacidad")
	private Integer capacidadAs;
	
	@OneToMany(mappedBy="avion", cascade = CascadeType.ALL)
	private List<Vuelo> vuelos;

	public Integer getAvionId() {
		return avionId;
	}

	public void setAvionId(Integer avionId) {
		this.avionId = avionId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCapacidadAs() {
		return capacidadAs;
	}

	public void setCapacidadAs(Integer capacidadAs) {
		this.capacidadAs = capacidadAs;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

}
