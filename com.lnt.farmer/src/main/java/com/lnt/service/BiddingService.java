package com.lnt.service;

import java.util.List;

import com.lnt.domain.Bidding;

public interface BiddingService {

	public void addNewBiddingService(Bidding b);
	List<Bidding> getAllBiddingService();
	
}
