package com.example.demo.examen.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.examen.modelo.Cliente;

@Repository
@Transactional
public class ClienteRepositoryImpl implements IClienteRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void incertar(Cliente ciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciente);
	}
	
	

}
