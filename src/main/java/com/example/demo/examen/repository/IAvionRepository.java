package com.example.demo.examen.repository;

import com.example.demo.examen.modelo.Avion;

public interface IAvionRepository {
	
	public void incertar(Avion avion);
	public Avion buscarPorNumero(String numero);

}
