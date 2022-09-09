package com.example.demo.examen.service;

import java.util.List;

import com.example.demo.examen.modelo.BuscarVueloTo;
import com.example.demo.examen.modelo.Vuelo;
import com.example.demo.examen.modelo.VuelosDisponiblesTo;

public interface IVueloService {
	
	public void incertar(Vuelo vuelo);
	public List<VuelosDisponiblesTo> vuelosDis(BuscarVueloTo vueloB);

}
