package com.example.studentmanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.exception.StudentNotFoundException;

public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(long id) throws StudentNotFoundException;
	void deleteStudentById(long id);
	Page<Student> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}