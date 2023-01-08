package com.crud_jbbc.reposatry.jdbcmimplemntation;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.crud_jbbc.model.Employee;
import com.crud_jbbc.reposatry.EmployeeRepos;
@Repository
//here implements to method in interface here write code
public class employeejdbcmimplemntation implements EmployeeRepos {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public int count() {
		return jdbctemplate.queryForObject("select count(*) from employeest ", Integer.class);
	}

	

	@Override
	public List<Employee> findAll() {
		return jdbctemplate.query("select id,name,salary from employeest ",new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public int insert(Employee employee) {
		
		return jdbctemplate.update("INSERT INTO employeest(id, name , salary) VALUES(?,?,?)",
				new Object[] {employee.getId(),employee.getName(),employee.getSalary()});
		
	}
	
	@Override
	public int update(Employee employee,long id) {
		
		return jdbctemplate.update("update employeest " + " set  name = ?,salary = ? " + " where id = ?",new Object[] {employee.getName(),employee.getSalary(),id});
		
	}
  
	@Override
	public int deleteb(long id) {
		// TODO Auto-generated method stub
		return jdbctemplate.update("delete from employeest where id=?",id);
	}




	

	
}

