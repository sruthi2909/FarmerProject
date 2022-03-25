package com.lnt.service;

import java.util.List;

import com.lnt.domain.Bidder;

public interface BidderService {
	
	List<Bidder> getAllBidderService();
	void addBidderService(Bidder bidder);
	Bidder serachByIdService(int id);

	
	

}
