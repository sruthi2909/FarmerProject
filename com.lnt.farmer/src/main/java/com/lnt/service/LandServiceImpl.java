package com.lnt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lnt.domain.Land;
import com.lnt.repository.LandDao;
@Component
@Transactional

public class LandServiceImpl implements LandService{

	@Autowired
	private LandDao landDao;
	@Override
	public void addNewLandService(Land l) {
		System.out.println("Bye..........");

		landDao.addNewLand(l);
		
	}

	@Override
	public List<Land> getAllLandService() {
		
		return landDao.getAllLand();
	}

}
