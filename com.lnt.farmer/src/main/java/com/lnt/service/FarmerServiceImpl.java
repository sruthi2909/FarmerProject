package com.lnt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lnt.domain.Farmer;
import com.lnt.repository.FarmerDao;
@Component
@Transactional

public class FarmerServiceImpl implements FarmerService{

	
	
	@Autowired
	private FarmerDao farmerDao;

	@Override
	public void addNewFarmerService(Farmer f) {

		farmerDao.addNewFarmer( f);
	}

	@Override
	public List<Farmer> getAllFarmerSerice() {
		return farmerDao.getAllFarmer();
	}
	

	
}
