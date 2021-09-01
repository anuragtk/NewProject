package com.pro.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.demo.entity.Employee;
import com.pro.demo.repository.EmpRepo;

@Service
public class EmpService {
	
	
	@Autowired
	EmpRepo empRepo;
	public List<Employee> employee = new ArrayList<Employee>();
	
	public List<Employee> getData() {
		return employee;
		
	}

	public List<Employee> getEmpbyId(int eid) {
		
		return empRepo.findOne(eid);
	}

	
}
