package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

	@Query("select s from Register s where s.Register_number = :Register_number ")
	List<Register> findByRegno(@Param("Register_number")long Register_number);
	
	
}