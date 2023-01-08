package com.crud_jbbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrGlobalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrGlobalApplication.class, args);
		
		System.out.println("http://localhost:9092/employee/count");
	}

}
