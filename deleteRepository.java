package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
public interface deleteRepository extends JpaRepository<Student, Long>{

	//@Query("delete from  Student  where RegisterNumber = :RegisterNumber")
   // Optional<Student> findByRegno(@Param("RegisterNumber") long registerNumber);
//	@Query("delete from Student where RegisterNumber= :RegisterNumber")
//    List<Student> findByReg(@Param("RegisterNumber") int registerNumber);
}
