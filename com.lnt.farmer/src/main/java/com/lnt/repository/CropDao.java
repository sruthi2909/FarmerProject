package com.lnt.repository;

import java.util.List;

import com.lnt.domain.Bidding;
import com.lnt.domain.Crop;
import com.lnt.domain.Farmer;

public interface CropDao {

	List<Crop> getAllCrop();
	Crop searchCropById(int id);
	void addNewCrop(Crop crop);
	void approveStatus(int id, Crop crop);

	 void buyCrop( Bidding bidding, int cropId);

}
