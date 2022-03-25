package com.lnt.service;

import java.util.List;

import com.lnt.domain.Farmer;

public interface FarmerService {

	public void addNewFarmerService(Farmer f);
	List<Farmer> getAllFarmerSerice();
}
