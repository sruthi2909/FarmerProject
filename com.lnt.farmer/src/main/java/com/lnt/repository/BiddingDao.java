package com.lnt.repository;

import java.util.List;

import com.lnt.domain.Bidding;

public interface BiddingDao {
	
	public void addNewBidding(Bidding b);
	List<Bidding> getAllBidding();
	

}
