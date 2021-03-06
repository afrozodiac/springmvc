package com.cg.mpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.mpa.entities.PurchaseDetails;
@Repository
public class PurchaseDetailDaoImpl implements PurchaseDetailDao
{
	@PersistenceContext
	private EntityManager em;
	@Override
	public void insertPurchaseDetails(PurchaseDetails pdetails)
	{
		em.persist(pdetails);
	}		
}
