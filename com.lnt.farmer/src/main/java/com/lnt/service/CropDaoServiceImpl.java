package com.lnt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lnt.domain.Bidding;
import com.lnt.domain.Crop;
import com.lnt.repository.CropDao;

@Component
@Transactional
public class CropDaoServiceImpl implements CropDaoService{

	@Autowired
	private CropDao cropDao;
	
	@Override
	public List<Crop> getAllCropService() {
		// TODO Auto-generated method stub
		return cropDao.getAllCrop();
	}

	@Override
	public Crop searchCropByIdService(int id) {
		// TODO Auto-generated method stub
		return cropDao.searchCropById(id);
	}

	@Override
	public void addNewCropService(Crop crop) {
		// TODO Auto-generated method stub
		
		cropDao.addNewCrop(crop);
	}

	@Override
	public void approveStatusService(int id, Crop crop) {
		// TODO Auto-generated method stub
		cropDao.approveStatus(id, crop);
	}

	@Override
	public void buyCropService(Bidding bidding, int cropId) {
		// TODO Auto-generated method stub
		cropDao.buyCrop(bidding, cropId);
	}

}
