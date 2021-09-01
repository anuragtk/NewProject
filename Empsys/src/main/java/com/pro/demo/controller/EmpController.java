package com.pro.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.demo.entity.Employee;
import com.pro.demo.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService empSer;
	
	@GetMapping("/get")
	public List<Employee> getData(){
	 	
	   return empSer.getData();	
	} 

    @GetMapping("get/{id}")
    public List<Employee> getEmp(@PathVariable int id, int eid){
    	
    	return empSer.getEmpbyId(eid);
    }
}
