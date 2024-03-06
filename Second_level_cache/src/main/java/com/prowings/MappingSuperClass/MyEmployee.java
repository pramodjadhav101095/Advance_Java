package com.prowings.MappingSuperClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Entity
public class MyEmployee extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	
	private String Name;
	private double salary;
	public MyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyEmployee(String name, double salary,int hight,int weight) {
		super( hight, weight);
		//this.id = id;
		Name = name;
		this.salary = salary;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MyEmployee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
	}

}
