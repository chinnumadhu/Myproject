package com.example.demo.rest;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Registerbean;
import com.example.demo.config.ContextLoader;
import com.example.demo.entity.Register;




@RestController
public class RegisterController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	 //ApplicationContext ctx = 
	   //      new AnnotationConfigApplicationContext(DemoConfig.class);
    @Autowired
    Registerbean rb = null;
    @RequestMapping("/greeting")
    public Greetings greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println("greeting controller");
	    //  Manager m = ContextLoader.getInstance().getApplicationContext().getBean(Manager.class);
	      //m.appraise();
	      //System.out.println("Loading  company");
	      //Company c = ContextLoader.getInstance().getApplicationContext().getBean(Company.class);
	      //c.open();
	      //StudentBean sb = ContextLoader.getInstance().getApplicationContext().getBean(StudentBean.class);
	      Register r = new Register();
//	     r.setRegister_number(1);
//	     r.setName("Chinnu");
//	     r.setBranchName("CSE");
//	     r.setDateOfBirth("1997-11-24");
//	     r.setYearofpassing12th("2012");
//	     r.setMarks(85);
//	     r.setNssCadet("No");
//	     r.setAddress("Vizag");
//	     r.setEmailAddress("chinnu@gmail.com");
//	     r.setFees(30000);
//	    rb.saveRegister(r);
        return new Greetings(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping(value = "/createRegister", method = RequestMethod.POST)
   	public @ResponseBody Register createRegister(@RequestBody Register r) {
   		System.out.println("RegNo:" + r.getRegister_number());
   		System.out.println("Name:" + r.getName());
   		System.out.println("BranchName:" + r.getBranch_name());
   		System.out.println("DateOfBirth:" + r.getDate_of_birth());
   		System.out.println("Yearofpassing12th:"+r.getYearofpassing12th());
   		System.out.println("Marks:"+ r.getMarks());
   		System.out.println("NssCadet:"+ r.getNss_cadet());
   		System.out.println("Address:"+ r.getAddress());
   		System.out.println("EmailAddress:"+ r.getEmail_address());
   		System.out.println("Fees:"+ r.getFees());
   		rb.saveRegister(r);
   		return r;
    }
    @RequestMapping(value = "/fetchStudentsByRbd", method = RequestMethod.POST)
   	public @ResponseBody List<Register> fetchStudents(@RequestBody String s) {
   		System.out.println("RegNo:" + s);
   		return rb.findStudentsByRbd(new Integer(s));
   	}
}