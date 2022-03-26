package com.example.studentmanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.studentmanagement.dto.UserRegistrationDto;
import com.example.studentmanagement.entity.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}