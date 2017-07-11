package org.nisum.demoMongoProj.service;

import java.util.List;

import org.nisum.demoMongoProj.model.Employee;
import org.nisum.demoMongoProj.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private DataRepository _dataRepository;

	@Autowired
	public EmployeeServiceImpl(DataRepository dataRepository) {
		super();
		_dataRepository = dataRepository;
	}

	@Override
	public void insert(Employee employee) {

		_dataRepository.insert(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return _dataRepository.getEmployees();
	}
	
	

}
