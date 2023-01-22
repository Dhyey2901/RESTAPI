package com.springrest.springrest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name="stu_id")
	private int stu_id;
	
	@Column(name="name")
	private String name;
	
	public Student(int stu_id, String name) {
		super();
		this.stu_id = stu_id;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
