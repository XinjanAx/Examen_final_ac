package com.example.demo.examen.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.examen.modelo.Avion;

@Repository
@Transactional
public class AvionRepositoryImpl implements IAvionRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public void incertar(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(avion);
	}

	@Override
	public Avion buscarPorNumero(String numero) {
		TypedQuery<Avion> myQuery = this.entityManager
				.createQuery("SELECT a FROM Avion a WHERE a.numero = :datoNumero",Avion.class)
				.setParameter("datoNumero", numero);
		return myQuery.getSingleResult();
	}
	

}
