package org.nisum.demoMongoProj.model;

public class Employee {

	private int _id;
	private String _empName;
	private String _empDesignation;
	private double _empSalary;

	public Employee(){
		
	}
	
	public Employee(int _id, String _empName, String _empDesignation, double _empSalary) {
		super();
		this._id = _id;
		this._empName = _empName;
		this._empDesignation = _empDesignation;
		this._empSalary = _empSalary;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_empName() {
		return _empName;
	}

	public void set_empName(String _empName) {
		this._empName = _empName;
	}

	public String get_empDesignation() {
		return _empDesignation;
	}

	public void set_empDesignation(String _empDesignation) {
		this._empDesignation = _empDesignation;
	}

	public double get_empSalary() {
		return _empSalary;
	}

	public void set_empSalary(double _empSalary) {
		this._empSalary = _empSalary;
	}

}
