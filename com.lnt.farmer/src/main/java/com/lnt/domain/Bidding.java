package com.lnt.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Bidding {
	
	@Id
	@GeneratedValue
	private int biddingId;
	double currentBidAmount;
	private double bidAmount;

	//for crop-bidding mapping
	@JsonBackReference(value="crop-bidding")
	@ManyToOne
	@JoinColumn(name="cropId")
	private Crop crop;

	public Bidding() {
		
	}

	public Bidding(int biddingId, double currentBidAmount, double bidAmount) {
		super();
		this.biddingId = biddingId;
		this.currentBidAmount = currentBidAmount;
		this.bidAmount = bidAmount;
	}

	public int getBiddingId() {
		return biddingId;
	}

	public void setBiddingId(int biddingId) {
		this.biddingId = biddingId;
	}

	public double getCurrentBidAmount() {
		return currentBidAmount;
	}

	public void setCurrentBidAmount(double currentBidAmount) {
		this.currentBidAmount = currentBidAmount;
	}

	public double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}

	public Crop getCrop() {
		return crop;
	}

	public void setCrop(Crop crop) {
		this.crop = crop;
	}


	
	

}
