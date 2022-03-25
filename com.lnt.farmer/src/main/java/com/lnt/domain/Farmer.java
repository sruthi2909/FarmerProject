package com.lnt.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Farmer {
	@Id
	@GeneratedValue
	private int farmerId;
	private String fullName;
	private String emailId;
	private String city;
	private String Address;
	private String state;
	private long contactNo;
	private int pincode;
	private String password;
	private String ifscCode;
	@Column(unique = true)
	private long acctNo;
	
	/*Bi-directional mapping (Farmer --> Document)*/
	@OneToOne(cascade = CascadeType.PERSIST,mappedBy = "farmer")
	@JsonManagedReference(value = "farmer-document")
	//indictaes parent(who owns relationship)
	Document doc;
	
	@JsonManagedReference(value="farmer-crop")
	@OneToMany(mappedBy = "farmer",cascade = CascadeType.ALL)
	List<Crop> crops;
	

	/*Bi-directional mapping (Farmer --> Land)*/
	@OneToMany(cascade = CascadeType.ALL, mappedBy="farmer",fetch = FetchType.LAZY)
	private List<Land> land;

	public Farmer() {
		
	}

	public Farmer(int farmerId, String fullName, String emailId, String city, String address, String state,
			long contactNo, int pincode, String password, String ifscCode, long acctNo) {
		super();
		this.farmerId = farmerId;
		this.fullName = fullName;
		this.emailId = emailId;
		this.city = city;
		Address = address;
		this.state = state;
		this.contactNo = contactNo;
		this.pincode = pincode;
		this.password = password;
		this.ifscCode = ifscCode;
		this.acctNo = acctNo;
	}

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	public List<Crop> getCrops() {
		return crops;
	}

	public void setCrops(List<Crop> crops) {
		this.crops = crops;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public long getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(long acctNo) {
		this.acctNo = acctNo;
	}
	@JsonManagedReference(value = "farmer-land")
	//indicates parent(who owns the relationship)
	//bi-directional mapping -->to avoid infinite recursion
	public List<Land> getLand() {
		return land;
	}

	public void setLand(List<Land> land) {
		this.land = land;
	} 
	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}
	


}
