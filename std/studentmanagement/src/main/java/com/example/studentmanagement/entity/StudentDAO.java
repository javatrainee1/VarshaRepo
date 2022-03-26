package com.example.studentmanagement.entity;

public class StudentDAO {
	private Long id;
	private String studentname;
	private String coursename;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public StudentDAO(String studentname, String coursename) {
		super();
		this.studentname = studentname;
		this.coursename = coursename;
	}
	public StudentDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}