package com.lnt.service;

import java.util.List;

import com.lnt.domain.Bidding;
import com.lnt.domain.Crop;

public interface CropDaoService {

	List<Crop> getAllCropService();
	Crop searchCropByIdService(int id);
	void addNewCropService(Crop crop);

	 void buyCropService( Bidding bidding, int cropId);
	
	void approveStatusService(int id, Crop crop);

}
