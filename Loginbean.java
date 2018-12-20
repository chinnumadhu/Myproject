package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Loginpage;

import com.example.demo.repository.LoginRepository;





@Component
public class Loginbean {
	@Autowired
	LoginRepository repo;

	public void saveLogin(Loginpage l) {
		repo.save(l);
		
		System.out.println("register saved-->"+l.getNumber());
		System.out.println("register saved-->"+l.getUserName());
		System.out.println("register saved-->"+l.getPassword());
		
		
		
	}

	
}
