package org.nisum.demoMongoProj.repository;

import java.util.List;

import org.nisum.demoMongoProj.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository {

	public void insert(Employee employee);
	
	public List<Employee> getEmployees();
	
}
