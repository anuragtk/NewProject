package com.pro.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.demo.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

	public List<Employee> findOne(int eid);

}
