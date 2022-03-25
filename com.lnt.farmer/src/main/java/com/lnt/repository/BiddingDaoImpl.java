package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lnt.domain.Bidding;

@Repository
public class BiddingDaoImpl implements BiddingDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public void addNewBidding(Bidding b) {
		// TODO Auto-generated method stub
		em.persist(b);
		
	}

	@Override
	public List<Bidding> getAllBidding() {
		// TODO Auto-generated method stub
		return em.createQuery("select b from Bidding b",Bidding.class).getResultList();
	}

}
