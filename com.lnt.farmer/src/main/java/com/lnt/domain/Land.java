package com.lnt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class Land {
	@Id
	@GeneratedValue
	private int survyNo;
	private int area;
	private String address;
	private int pincode;
	

	@ManyToOne()
	@JoinColumn(name="farmerId")
	private Farmer farmer;

	public Land() {
		
	}

	public Land(int survyNo, int area, String address, int pincode) {
		super();
		this.survyNo = survyNo;
		this.area = area;
		this.address = address;
		this.pincode = pincode;
	}

	public int getSurvyNo() {
		return survyNo;
	}

	public void setSurvyNo(int survyNo) {
		this.survyNo = survyNo;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@JsonBackReference(value = "farmer-land")
	//indicates child
	//bi-directional mapping -->to avoid infinite recursion
	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}


}
