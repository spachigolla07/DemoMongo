package org.nisum.demoMongoProj.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.nisum.demoMongoProj.model.Employee;
import org.nisum.demoMongoProj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class DemoController {

	private EmployeeService _employeeService;
	
	@Autowired
	public DemoController(EmployeeService employeeService){
		_employeeService=employeeService;
	}
	
	@POST
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public @ResponseBody Employee insertEmployee(@RequestBody Employee employee){
		_employeeService.insert(employee);
		return employee;
	}
	
	@GET
	@RequestMapping(value="/retrieve",method=RequestMethod.GET)
	public @ResponseBody List<Employee> getEmployees(){
		return _employeeService.getEmployees();
	}
	
	
}
