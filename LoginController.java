package com.example.demo.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Loginbean;
import com.example.demo.config.ContextLoader;
import com.example.demo.entity.Loginpage;


@RestController
public class LoginController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	 //ApplicationContext ctx = 
	   //      new AnnotationConfigApplicationContext(DemoConfig.class);
    @Autowired
    Loginbean lb = null;
    @RequestMapping("/greeting")
    public Greetings greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println("greeting controller");
	    //  Manager m = ContextLoader.getInstance().getApplicationContext().getBean(Manager.class);
	      //m.appraise();
	      //System.out.println("Loading  company");
	      //Company c = ContextLoader.getInstance().getApplicationContext().getBean(Company.class);
	      //c.open();
	      //StudentBean sb = ContextLoader.getInstance().getApplicationContext().getBean(StudentBean.class);
	      Loginpage l = new Loginpage();
	      l.setNumber(1);
	      l.setUserName("Madhu");
	      l.setPassword("chinnu");
	      lb.saveLogin(l);
        return new Greetings(counter.incrementAndGet(),
                            String.format(template, name));
    }
}