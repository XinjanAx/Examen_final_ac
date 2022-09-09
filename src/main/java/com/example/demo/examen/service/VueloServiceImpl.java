package com.example.demo.examen.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.examen.modelo.BuscarVueloTo;
import com.example.demo.examen.modelo.Vuelo;
import com.example.demo.examen.modelo.VuelosDisponiblesTo;
import com.example.demo.examen.repository.IVueloRepository;

@Service
public class VueloServiceImpl implements IVueloService{

	@Autowired
	private IVueloRepository vueloRepository;
	@Override
	public void incertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepository.incertar(vuelo);
	}
	
	@Override
	public List<VuelosDisponiblesTo> vuelosDis(BuscarVueloTo vueloB) {
		// TODO Auto-generated method stub
		System.out.println(vueloB);
		List<VuelosDisponiblesTo> lista = this.vueloRepository
				.buscarVuelos(vueloB.getOrigen(), vueloB.getDestino(), LocalDateTime.of(Integer.parseInt(vueloB.getFechaA()), Integer.parseInt(vueloB.getFechaM()), Integer.parseInt(vueloB.getFechaD()), 0, 0));
		
		System.out.println(lista);
		return lista;
	}
}
