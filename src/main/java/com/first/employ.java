package com.first;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class employ {
	
	@Id
	private String name;
	private String dprtName;
	private int salary;
	private int empCode;
	public employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "employ [name=" + name + ", dprtName=" + dprtName + ", salary=" + salary + ", empCode=" + empCode + "]";
	}
	public employ(String name, String dprtName, int salary, int empCode) {
		super();
		this.name = name;
		this.dprtName = dprtName;
		this.salary = salary;
		this.empCode = empCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDprtName() {
		return dprtName;
	}
	public void setDprtName(String dprtName) {
		this.dprtName = dprtName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	
//   public List<employ> addallemp() {
//	List<employ> emplist = new ArrayList<>();
//	emplist.add(new employ("anshi","it",22,100));
//	emplist.add(new employ("aman","finance",2,100));
//	emplist.add(new employ("ravi","cs",12,100));
//	emplist.add(new employ("riya","data",42,100));
//	emplist.add(new employ("lakshay","product",20,100));
//	return emplist;
//
//   }	
}
