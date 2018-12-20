package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.config.ContextLoader;

@SpringBootApplication
@EnableJpaAuditing

public class Loginpage1Application {


	
	public static void main(String[] args) {
		ApplicationContext ctx =	SpringApplication.run(Loginpage1Application.class, args);
		ContextLoader.getInstance().storeApplicationContext(ctx);
	}
}
