package com.example.demo.examen.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.examen.modelo.Vuelo;
import com.example.demo.examen.modelo.VuelosDisponiblesTo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void incertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}
	@Override
	public List<VuelosDisponiblesTo> buscarVuelos(String origen, String destino, LocalDateTime fechaVuelo) {
		TypedQuery<VuelosDisponiblesTo> myQuery = this.entityManager.createQuery("SELECT NEW com.example.demo.examen.modelo.VuelosDisponiblesTo (v.numero, v.origen, v.destino, v.avion.nombre, v.valorAsiento) FROM Vuelo v WHERE v.origen = :datoOrigen AND v.destino = :datoDestino AND fechaVuelo = :datoFechaVuelo", VuelosDisponiblesTo.class);
        myQuery.setParameter("datoOrigen", origen);
        myQuery.setParameter("datoDestino", destino);
        myQuery.setParameter("datoFechaVuelo", fechaVuelo);
        return myQuery.getResultList();
	}
	

}
