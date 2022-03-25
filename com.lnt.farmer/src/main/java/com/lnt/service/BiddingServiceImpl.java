package com.lnt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lnt.domain.Bidding;
import com.lnt.repository.BiddingDao;

@Component
@Transactional
public class BiddingServiceImpl implements BiddingService{

	@Autowired
	private BiddingDao biddingDao;
	@Override
	public void addNewBiddingService(Bidding b) {
		// TODO Auto-generated method stub
		biddingDao.addNewBidding(b);
	}

	@Override
	public List<Bidding> getAllBiddingService() {
		// TODO Auto-generated method stub
		return biddingDao.getAllBidding();
	}
	

}
