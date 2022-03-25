package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.domain.Bidder;
import com.lnt.repository.BidderDao;

@Component
@Transactional
public class BidderServiceImpl implements BidderService{
	@Autowired
	private BidderDao bidderDao;
	@Override
	public List<Bidder> getAllBidderService() {
		// TODO Auto-generated method stub
		return bidderDao.getAllBidder();
	}
	@Override
	public void addBidderService(Bidder bidder) {
		// TODO Auto-generated method stub
		bidderDao.addNewBidder(bidder);
		
	}
	@Override
	public Bidder serachByIdService(int id) {
		// TODO Auto-generated method stub
		return bidderDao.searchBidderById(id);
	}

}
