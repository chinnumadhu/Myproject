package com.example.demo.rest;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.bean.Studentbean;
import com.example.demo.config.ContextLoader;
import com.example.demo.entity.Student;

@RestController
public class GreetingsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	 //ApplicationContext ctx = 
	   //      new AnnotationConfigApplicationContext(DemoConfig.class);
    @Autowired
    Studentbean sb = null;
    @RequestMapping("/greeting")
    public Greetings greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println("greeting controller");
	      Student s = new Student();
//	        s.setRegisterNumber(2);
//	    	s.setBranchName("ECE");
//	    	s.setSemester("S1");
//	    	s.setDateofBirth("1996-08-24");
//	    	s.setAcademicMarks(70);
//	    	s.setSportsMarks(5);
//	    	s.setArtsMarks(3);
//	    	s.setCulturalMarks(4);
//	    	s.setScholarship("1500");
//	    	s.setGrade("B");
//	    	s.setAttendance(60);
//	    	sb.saveStudent(s);

        return new Greetings(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping(value = "/createStudent", method = RequestMethod.POST)
   	public @ResponseBody Student createStudent(@RequestBody Student s) {
   		System.out.println("RegNo:" + s.getRegisterNumber());
   		System.out.println("BranchName:" + s.getBranch_name());
   		System.out.println("Semester:" +s.getSemester());
   		System.out.println("DateOfBirth:" + s.getDateof_birth());
   		System.out.println("AcademicsMarks:"+s.getAcademic_marks());
   		System.out.println("SportsMarks:"+ s.getSports_marks());
   		System.out.println("ArtsMarks:"+ s.getArts_marks());
   		System.out.println("CulturalMarks:"+ s.getCultural_marks());
   		System.out.println("Scholarship:"+ s.getScholarship());
   		System.out.println("Grade:"+ s.getGrade());
   		System.out.println("Attendance:"+ s.getAttendance());
   		sb.saveStudent(s);
   		return s;
   	}
    @RequestMapping(value = "/fetchRegistration", method = RequestMethod.POST)
   	public @ResponseBody List<Student> fetchRegistration() {
   		return sb.findRegister();
   	}
  @RequestMapping(value = "/fetchStudentsByRbd", method = RequestMethod.POST)
	public @ResponseBody List<Student> fetchStudents(@RequestBody String s) {
		System.out.println("RegNo:" + s);
		return sb.findStudentsByRbd(new Integer(s));
	}
   @RequestMapping(value = "/deleteStudents", method = RequestMethod.POST)
	public @ResponseBody Optional<Student> deleteStudents(@RequestBody String s) {
	 System.out.println("Regno:" + s);
		return sb.deleteStudent(new Integer(s));
	}
   
}