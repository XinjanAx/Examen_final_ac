package com.example.demo.examen.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cli_seq_id")
	@SequenceGenerator(name = "cli_seq_id",sequenceName = "cli_seq_id",allocationSize = 1)
	@Column(name="cli_id")
	private Integer id;
	
	@Column(name="cli_nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "cliente")
	private List<CompraPasaje> compraP;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CompraPasaje> getCompraP() {
		return compraP;
	}

	public void setCompraP(List<CompraPasaje> compraP) {
		this.compraP = compraP;
	}

}
