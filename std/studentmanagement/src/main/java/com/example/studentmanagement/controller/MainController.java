package com.example.studentmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.studentmanagement.entity.Course;
import com.example.studentmanagement.entity.StudentDAO;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.CourseService;
import com.example.studentmanagement.service.StudentService;
import com.example.studentmanagement.service.UserService;


@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	private CourseService service;
	
	@Autowired
	private StudentService services;
	
	@Autowired
	private StudentRepository studentRepository;
	
    @Autowired
    private UserService userService;
    
    @GetMapping("/login")
	public String login() {
		return "login";
	}
   
    
	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.GET)
	public String viewStudentPage(Model model) {
		List<StudentDAO> li = new ArrayList<>();
		for(Object[] o : studentRepository.findStudent()) {
			StudentDAO student = new StudentDAO();
			student.setId(Long.parseLong(String.valueOf(o[0])));
			student.setStudentname((String) o[1]);
			student.setCoursename((String) o[2]);
			li.add(student);
		}
		model.addAttribute("liststudent",li);
		return "student";
	}

	
	
	@RequestMapping(value ="/course" , method = RequestMethod.GET)
	 public String viewHomePage(Model model) {
	     List<Course> listcourse = service.listAll();
	     model.addAttribute("listcourse",listcourse);
	     System.out.print("Get /");
	     return "Course";
  }
	
	 @RequestMapping({"/admin/dashboard","/admin"})
	    public String dashboard(){
	        return "admin/dashboard";
	    }

	    @RequestMapping({"/admin/user/list","/admin/user"})
	    public String listUser(){
	        return "admin/user-list";
	    }

	    @RequestMapping("/admin/user/add")
	    public String addUser(){
	        return "admin/user-add";
	    }
}