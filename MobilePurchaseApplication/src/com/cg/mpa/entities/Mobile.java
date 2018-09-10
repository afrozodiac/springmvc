package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobiles")
public class Mobile 
{
	@Id
	@Column(name="mobileid")
	private Integer mobileId;
	
	@Column(name="name")
	private String mobileName;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="quantity")
	private Integer quantity;

	public Integer getMobileId() 
	{
		return mobileId;
	}

	public void setMobileId(Integer mobileId) 
	{
		this.mobileId = mobileId;
	}

	public String getMobileName() 
	{
		return mobileName;
	}

	public void setMobileName(String mobileName) 
	{
		this.mobileName = mobileName;
	}

	public Double getPrice() 
	{
		return price;
	}

	public void setPrice(Double price) 
	{
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
