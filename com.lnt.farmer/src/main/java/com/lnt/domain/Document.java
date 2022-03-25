package com.lnt.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Document {
	@Id
	@GeneratedValue
	private int docId;
	@Column(unique = true)
	private long aadhar;
	@Column(unique = true)
	private long pan;
	private String traderLicense;
	
//	@OneToOne(cascade = CascadeType.PERSIST,mappedBy = "docId")
//	Farmer farmer;
	/*1-1 with Farmer-Document*/
	@OneToOne
	@JoinColumn(name ="farmerId")
	@JsonBackReference(value = "farmer-document")
	Farmer farmer;
	
//	@OneToOne(cascade = CascadeType.ALL,mappedBy = "doc")
//	@JsonManagedReference
	
	
	/*[1-1] Bidder --> Document */
	@OneToOne
	@JoinColumn(name="bidderId")
	@JsonBackReference(value = "bidder-document")
	//indicates child
	Bidder bidder;
	
	
	public Document() {
		// TODO Auto-generated constructor stub
	}
	public Document(int docId, long aadhar, long pan) {
		super();
		this.docId = docId;
		this.aadhar = aadhar;
		this.pan = pan;
	}
	
	
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public long getPan() {
		return pan;
	}
	public void setPan(long pan) {
		this.pan = pan;
	}
	public Bidder getBidder() {
		return bidder;
	}
	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}
	public String getTraderLicense() {
		return traderLicense;
	}
	public void setTraderLicense(String traderLicense) {
		this.traderLicense = traderLicense;
	}
	public Farmer getFarmer() {
		return farmer;
	}
	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	
	
	
	
}
