package com.prowings.MappingSuperClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student extends Person {
	@Column
	private String sub;
	@Id
	@Column
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sub, int age) {
		super();
		this.sub = sub;
		this.age = age;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sub=" + sub + ", age=" + age + "]";
	}

}
