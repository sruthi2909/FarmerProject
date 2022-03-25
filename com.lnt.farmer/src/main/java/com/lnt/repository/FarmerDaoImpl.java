package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lnt.domain.Farmer;
@Repository
public class FarmerDaoImpl implements FarmerDao{

	@PersistenceContext
	
	EntityManager em;
	
	@Override
	public void addNewFarmer(Farmer f) {
		em.persist(f);
		
	}
	@Override
	public List<Farmer> getAllFarmer() {
		return em.createQuery("select f from Farmer f ", Farmer.class).getResultList();
	}

}
