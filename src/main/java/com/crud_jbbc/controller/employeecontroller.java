package com.crud_jbbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud_jbbc.model.Employee;
import com.crud_jbbc.reposatry.EmployeeRepos;

@RestController
@RequestMapping("/employee")
public class employeecontroller {
	@Autowired
    private EmployeeRepos employeeRepos;
	
	@GetMapping("/count")
	public int countEmployee() {
		return employeeRepos.count();}
		
		
	
	@GetMapping("/get")
	public List<Employee> findAll() {
	
		return employeeRepos.findAll();}
	
	@PostMapping("/insert")
	public int insert(@RequestBody Employee employee) {
		return employeeRepos.insert(employee);}
	
	
	@PutMapping("/update/{id}")
	public int update(@RequestBody Employee employee,@PathVariable("id") long id) {
		return employeeRepos.update(employee,id);
		}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable Long id) {
		return employeeRepos.deleteb(id);	}	
	
	//@PutMapping("/employees/{id}")
	//@PostMapping("/employees")
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
