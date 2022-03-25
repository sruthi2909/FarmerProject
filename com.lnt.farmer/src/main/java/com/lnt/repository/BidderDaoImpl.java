package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lnt.domain.Bidder;
@Repository
public class BidderDaoImpl implements BidderDao{
	@PersistenceContext

	private EntityManager em;
	@Override
	public List<Bidder> getAllBidder() {
		// TODO Auto-generated method stub
		return em.createQuery("select b from Bidder b",Bidder.class).getResultList();
	}
	@Override
	public Bidder searchBidderById(int id) {
		// TODO Auto-generated method stub
		return em.find(Bidder.class, id);
	}
	@Override
	public void addNewBidder(Bidder bidder) {
		// TODO Auto-generated method stub
		em.persist(bidder);
	}
		
	

}
