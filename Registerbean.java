package com.example.demo.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Register;

import com.example.demo.repository.RegisterRepository;




@Component
public class Registerbean {
	@Autowired
	RegisterRepository repo;

	public void saveRegister(Register r) {
		repo.save(r);
		
		System.out.println("register saved-->"+r.getRegister_number());
		System.out.println("register saved-->"+r.getName());
		System.out.println("register saved-->"+r.getBranch_name());
		System.out.println("register saved-->"+r.getDate_of_birth());
		System.out.println("register saved-->"+r.getYearofpassing12th());
		System.out.println("register saved-->"+r.getMarks());
		System.out.println("register saved-->"+r.getNss_cadet());
		System.out.println("register saved-->"+r.getEmail_address());
		System.out.println("register saved-->"+r.getFees());
		
		
	}

	public List<Register> findStudentsByRbd(long Register_number) {
			for (Register s : repo.findByRegno(Register_number)) {
				System.out.println(s);

			}
			System.out.println("students fetched by registernumber****");
			return repo.findByRegno(Register_number);
			
	}

	
}
