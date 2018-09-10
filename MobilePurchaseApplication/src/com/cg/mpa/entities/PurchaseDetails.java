package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="purchasedetails")
public class PurchaseDetails
{
	@Id
	@Column(name="purchaseid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="seq_pur",allocationSize=1)
	private Integer purchaseId;
	
	@NotEmpty(message="Name is mandatory ")
	@Pattern(regexp="[A-Za-z]{3,15}",message="Name should not contain any symbols")
	@Column(name="cname")
	private String custName;
	
	@Column(name="phoneno")
	@NotEmpty(message="invalid phone number")
	@Pattern(regexp="[0-9]{10}",message="Phone Invalid")
	private String phoneno;
	
	@Column(name="mailid")
	@Email(message="enter a valid maill Id")
	private String emaildID;
	
	@Column(name="mobileid")
	private Integer mobileId;
	
	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mid) {
		this.mobileId = mid;
	}

	@Column(name="purchasedate")
	@Pattern(regexp="[0-9]{2}-[A-za-z]{3}-[0-9]{4}",message="date not valid")
	private String date;

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseid(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmaildID() {
		return emaildID;
	}

	public void setEmaildID(String emaildID) {
		this.emaildID = emaildID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
