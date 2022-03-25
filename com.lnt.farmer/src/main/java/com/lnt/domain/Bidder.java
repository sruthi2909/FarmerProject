package com.lnt.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Bidder {
	@Id
	@GeneratedValue
	private int bidderId;
	private String fullName;
	private long contactNo;
	private String emailId;
	private String password;
	private String city;
	private String state;
	private int pinCode;
	@Column(unique = true)
	private long accNo;
	private String ifsc;
	
	
	
	
	// joins at bidder side
//	@JsonIgnore
//	@OneToOne
//	@JoinColumn(name="docId")
//	@JsonBackReference
//	Document doc;
	
	/*[1-1] bidder -- document*/
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "bidder")
	@JsonManagedReference(value = "bidder-document")
	Document doc;



//	@OneToMany(cascade = CascadeType.PERSIST,mappedBy = "bidder")
public Bidder() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Bidder(int bidderId, String fullName, long contactNo, String emailId, String password, String city,
			String state, int pinCode, long accNo, String ifsc, Document doc) {
		super();
		this.bidderId = bidderId;
		this.fullName = fullName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.password = password;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.accNo = accNo;
		this.ifsc = ifsc;
		this.doc = doc;
	}
	
	public int getBidderId() {
		return bidderId;
	}
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public Document getDoc() {
		return doc;
	}
	public void setDoc(Document doc) {
		this.doc = doc;
	}
	
	
	
	
	

}
