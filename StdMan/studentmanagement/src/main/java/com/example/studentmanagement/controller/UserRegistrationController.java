package com.example.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentmanagement.dto.UserRegistrationDto;
import com.example.studentmanagement.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService user_service;

	public UserRegistrationController(UserService userService) {
		super();
		this.user_service = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		user_service.save(registrationDto);
		return "redirect:/registration?success";
	}
}