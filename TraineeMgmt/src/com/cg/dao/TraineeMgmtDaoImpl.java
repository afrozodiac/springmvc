package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
public class TraineeMgmtDaoImpl implements TraineeMgmtDao
{
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Trainee> FetchAllTrainee()
	{
		String jpql="select m from Trainee m";
		TypedQuery<Trainee> query=em.createQuery(jpql,Trainee.class);
		return query.getResultList();
	}
	
	
}
