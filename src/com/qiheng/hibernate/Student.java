package com.qiheng.hibernate;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

public class Student {
	
	private String id;
	
	private String student_name;
	
	private Timestamp timestamp;
	
	private List<Course> courses;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
