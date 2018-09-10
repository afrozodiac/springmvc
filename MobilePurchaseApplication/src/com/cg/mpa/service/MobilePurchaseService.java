package com.cg.mpa.service;

import java.util.List;

import com.cg.mpa.entities.Mobile;
import com.cg.mpa.entities.PurchaseDetails;

public interface MobilePurchaseService 
{
	List<Mobile> getAllMobile();
	void insertPurchaseDetails(PurchaseDetails pdetails);
}
