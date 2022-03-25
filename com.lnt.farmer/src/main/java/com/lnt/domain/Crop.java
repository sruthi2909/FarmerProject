package com.lnt.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Crop {
	
	@Id
	@GeneratedValue
	private int cropId;
	private String cropName;
	private String cropType;
	private  int soilPh;
	private int quantity;
	double basePrice;
	private String status;
	private String cropFertilizerType;

	
	
 // for farmer-crop  mapping
	@JsonBackReference(value="farmer-crop")
	@ManyToOne
	@JoinColumn(name="farmer_id")
	
	private Farmer farmer;
	
	//for crop-bidding mapping
	@JsonManagedReference(value="crop-bidding")
	@OneToMany(mappedBy="crop")
	private List<Bidding> biddingList;
	

	public Crop() {
		
	}

	public Crop(int cropId, String cropName,String cropFertilizerType, String cropType, int soilPh, int quantity, double baseprice,
			double soldprice, String status) {
		super();
		this.cropId = cropId;
		this.cropName = cropName;
		this.cropType = cropType;
		this.soilPh = soilPh;
		this.quantity = quantity;
		this.basePrice = baseprice;
		this.status = status;
		this.cropFertilizerType=cropFertilizerType;
	}

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	
	public String getCropFertilizerType() {
		return cropFertilizerType;
	}

	public void setCropFertilizerType(String cropFertilizerType) {
		this.cropFertilizerType = cropFertilizerType;
	}

	
	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public int getSoilPh() {
		return soilPh;
	}

	public void setSoilPh(int soilPh) {
		this.soilPh = soilPh;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBaseprice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public List<Bidding> getBiddingList() {
		return biddingList;
	}

	public void setBiddingList(List<Bidding> biddingList) {
		this.biddingList = biddingList;
	}

	

	
	
}
