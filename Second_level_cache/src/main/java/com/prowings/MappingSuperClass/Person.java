package com.prowings.MappingSuperClass;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

	private int hight;
	private int weight;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int hight, int weight) {
		super();
		this.hight = hight;
		this.weight = weight;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [hight=" + hight + ", weight=" + weight + "]";
	}

}
