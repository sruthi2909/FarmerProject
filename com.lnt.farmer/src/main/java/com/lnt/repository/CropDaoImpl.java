package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lnt.domain.Bidding;
import com.lnt.domain.Crop;

@Repository
public class CropDaoImpl implements CropDao{

	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Crop> getAllCrop() {
		
		
		return em.createQuery("select c from Crop c ",Crop.class).getResultList();
	}

	@Override
	public Crop searchCropById(int id) {
		// TODO Auto-generated method stub
		return em.find(Crop.class, id);
	}

	@Override
	public void addNewCrop(Crop crop) {

		em.persist(crop);
	}

	@Override
	public void approveStatus(int id ,Crop crop) {
		
		Crop managedCopy = searchCropById(id);
		managedCopy.setStatus(crop.getStatus());
		System.out.println("Updated.........");
	}

	@Override
	public void buyCrop(Bidding bidding, int cropId) {
		
		Crop c1 = new Crop();
		c1 = em.find(Crop.class, cropId);
		
		bidding.setCrop(c1);
		em.persist(bidding);
		
		
	}

}
