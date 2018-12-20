package com.example.demo.bean;

import java.util.List;
import java.util.Optional;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Component
public class Studentbean {
	@Autowired
	StudentRepository repo;

	public void saveStudent(Student s) {
		repo.save(s);
		
		System.out.println("register saved-->"+s.getRegisterNumber());
		System.out.println("register saved-->"+s.getBranch_name());
		System.out.println("register saved-->"+s.getSemester());
		System.out.println("register saved-->"+s.getDateof_birth());
		System.out.println("register saved-->"+s.getAcademic_marks());
		System.out.println("register saved-->"+s.getSports_marks());
		System.out.println("register saved-->"+s.getArts_marks());
		System.out.println("register saved-->"+s.getCultural_marks());
		System.out.println("register saved-->"+s.getScholarship());
		System.out.println("register saved-->"+s.getGrade());
		System.out.println("register saved-->"+s.getAttendance());
	}


	public List<Student> findRegister() {
		for (Student s : repo.findAll()) {
			System.out.println(s);

		}
		System.out.println("registration details fetched****");
		return repo.findAll();
	}

	public List<Student> findStudentsByRbd(long RegisterNumber) {
		for (Student s : repo.findByRegno(RegisterNumber)) {
			System.out.println(s);

		}
		System.out.println("students fetched by registernumber****");
		return repo.findByRegno(RegisterNumber);
			}
public Optional<Student> deleteStudent(long id) {
		
	Optional<Student> s = repo.findById(id);
	
				
		Student s1 = s.get();
			
			repo.delete(s1);
			return s;
	
			
		}
	
}
