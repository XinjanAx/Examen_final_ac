package com.example.demo.examen.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.examen.modelo.Vuelo;
import com.example.demo.examen.modelo.VuelosDisponiblesTo;

public interface IVueloRepository {
	
	public void incertar(Vuelo vuelo);
	public List<VuelosDisponiblesTo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo); 

}
