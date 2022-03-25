package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lnt.domain.Farmer;
import com.lnt.domain.Land;
@Repository

public class LandDaoImpl implements LandDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addNewLand(Land l) {
		
		em.persist(l);
	}

	@Override
	public List<Land> getAllLand() {
		return em.createQuery("select l from Land l ", Land.class).getResultList();
	}

}
