package com.wuheng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuheng.dao.AccountDao;
import com.wuheng.domain.Account;
import com.wuheng.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	@Override
	public List<Account> findAll() {
		return accountDao.findAll();
	}

}
