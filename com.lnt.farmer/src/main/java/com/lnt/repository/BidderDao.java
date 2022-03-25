package com.lnt.repository;

import java.util.List;

import com.lnt.domain.Bidder;

public interface BidderDao {
	
	List<Bidder> getAllBidder();
	Bidder searchBidderById(int id);
	void addNewBidder(Bidder bidder);
	

}
