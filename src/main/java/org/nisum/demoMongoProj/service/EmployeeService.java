package org.nisum.demoMongoProj.service;

import java.util.List;

import org.nisum.demoMongoProj.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	public void insert(Employee employee);
	
	public List<Employee> getEmployees();

}
