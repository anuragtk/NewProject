package com.pro.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pro.demo.entity.Employee;
import com.pro.demo.service.EmpService;

@SpringBootApplication
public class EmpsysApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmpsysApplication.class, args);
	}

	@Autowired
	EmpService empSer;
	
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee(1, "suresh", "raina", 25, "Delhi");
		Employee employee2 = new Employee(2, "K L", "Rahul", 30, "Mumbai");
		empSer.employee.addAll(Arrays.asList(employee1,employee2));
	}

}
