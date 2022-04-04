package com.unit.test;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InvalidNameException;

public class Employee {

	String firstName;
	String lastName;
	int id;
	char gender;
	String role;
	Double salary;
	String type;
	
	ArrayList<String> projects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, int id, char gender, String role, Double salary, String type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.gender = gender;
		this.role = role;
		this.salary = salary;
		this.type = type;
		this.projects=new ArrayList<String>();
	}
	
	public void adjustSalary(double adjustmentAmount)  {
	
		
		salary=salary+adjustmentAmount;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public void validateLastName()  throws Exception{
		 if(!this.lastName.matches("^[a-zA-Z]*$")) {
			 throw new InvalidNameException("There must be alphabets");
		 }
	}
	
	public void addProject(String projectName) {
		projects.add(projectName);
		
	}
	
	
	public List<String> getProjects(){
		return projects;
	}

}
