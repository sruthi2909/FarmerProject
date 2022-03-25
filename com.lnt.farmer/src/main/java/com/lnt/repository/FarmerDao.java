package com.lnt.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lnt.domain.Farmer;


public interface FarmerDao {

	public void addNewFarmer(Farmer f);
	List<Farmer> getAllFarmer();

}
