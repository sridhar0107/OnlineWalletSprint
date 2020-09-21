package com.capg.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capg.dao.Customer1Dao;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	Customer1Dao cus1Dao;

	@Override
	public Double addAmount(Integer cusId, Double balance) {
		// TODO Auto-generated method stub	
		Double b,c;
	 b= cus1Dao.getAmount(cusId) ;
		/*if(b==null)
		 c= 0+balance;
		else*/
		 c= b+balance;
		Integer d= cus1Dao.updateAmount(cusId, c) ;
		 return c;
	}

	@Override
	public void updateData(Integer cusId) {
		// TODO Auto-generated method stub
	String s="BALANCE PRESENT";		
	 cus1Dao.updateData(s,cusId);
	
	}



}