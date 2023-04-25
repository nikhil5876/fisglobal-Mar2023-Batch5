package com.example.adminservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.models.Account_master;
import com.example.adminservice.service.AccountService;

@RestController
public class AdminController {
	
	@Autowired
	AccountService accServ;
	
	@GetMapping("/")
	public String home() {
		return "Hello sid";
	}
	
	@PostMapping("/createAcc")
	public Account_master saveAccount(@RequestBody Account_master acc) {
		accServ.openAccount(acc);
		return acc;
	}

}
