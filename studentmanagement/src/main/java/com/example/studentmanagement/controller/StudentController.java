package com.example.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.exception.StudentNotFoundException;
import com.example.studentmanagement.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService Student_service;
	
	// display list of students
	@GetMapping("/")
	public String viewHomePage(Model model) {
		return findPaginated(1, "firstName", "asc", model);		
	}
	
	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		// create model attribute to bind form data
		Student Student = new Student();
		model.addAttribute("Student", Student);
		return "new_student";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("Student") Student student) {
		// save student to database
		Student_service.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model)throws StudentNotFoundException {
		
		// get employee from the service
		Student Student = Student_service.getStudentById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("Student", Student);
		return "update_student";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.Student_service.deleteStudentById(id);
		return "redirect:/";
	}
	
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Student> page = Student_service.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Student> listEmployees = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listStudents", listEmployees);
		return "index";
	}
}