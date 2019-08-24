package com.wuheng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuheng.domain.Account;
import com.wuheng.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/list")
	public List<Account> findAll(){
		List<Account> list = accountService.findAll();
		return list;
	}
	

}
