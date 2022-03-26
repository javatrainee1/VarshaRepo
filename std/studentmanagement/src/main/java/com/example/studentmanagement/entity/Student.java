package com.example.studentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String studentname;
	    private int fee;
	    private int course;
	     
		@Override
		public String toString() {
			return "Student [id=" + id + ", studentname=" + studentname + ", fee=" + fee + ", course=" + course + "]";
		}

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
		public int getFee() {
			return fee;
		}
		public void setFee(int fee) {
			this.fee = fee;
		}
		public int getCourse() {
			return course;
		}
		public void setCourse(int course) {
			this.course = course;
		}
		public Student(String studentname, int fee, int course) {
			super();
			this.studentname = studentname;
			this.fee = fee;
			this.course = course;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}