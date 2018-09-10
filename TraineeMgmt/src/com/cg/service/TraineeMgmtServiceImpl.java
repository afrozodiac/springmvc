package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeMgmtDao;
import com.cg.entities.Trainee;

@Service
@Transactional
public class TraineeMgmtServiceImpl implements TraineeMgmtService 
{
	@Autowired
	TraineeMgmtDao tdao;
	
	@Override
	public List<Trainee> FetchAllTrainee() 
	{
		return tdao.FetchAllTrainee();
	}
	
}
