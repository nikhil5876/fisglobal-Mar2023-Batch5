package com.example.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.AccountDoa;
import com.example.adminservice.models.Account_master;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDoa accDao;

	@Override
	public Account_master openAccount(Account_master acc) {
		// TODO Auto-generated method stub
		
		return accDao.save(acc);
	}

	@Override
	public Account_master deleteAccount(String accid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account_master allAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
