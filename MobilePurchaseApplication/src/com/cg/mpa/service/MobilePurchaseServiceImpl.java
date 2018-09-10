package com.cg.mpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mpa.dao.MobileDao;
import com.cg.mpa.dao.PurchaseDetailDao;
import com.cg.mpa.entities.Mobile;
import com.cg.mpa.entities.PurchaseDetails;

@Service
@Transactional
public class MobilePurchaseServiceImpl implements MobilePurchaseService
{
	@Autowired
	MobileDao mdao;
	@Autowired
	PurchaseDetailDao pdao;
	@Override
	public List<Mobile> getAllMobile() 
	{
		
		return mdao.fetchAllMobiles();
	}

	@Override
	public void insertPurchaseDetails(PurchaseDetails pdetails) 
	{
		pdao.insertPurchaseDetails(pdetails);
		
	}

}
