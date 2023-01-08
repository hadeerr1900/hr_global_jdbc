package com.crud_jbbc.reposatry;

import java.util.List;

import org.apache.el.stream.Optional;

import com.crud_jbbc.model.Employee;

public interface EmployeeRepos {
	//interface for create method to deal with database this method are abstract becase this interface
	
		//to count number record in table in database
	
		int count();
		
		List<Employee> findAll();
		
		
		int insert(Employee employee);
		
		int update(Employee employee,long id);
		
		int deleteb(long id);

		

}
