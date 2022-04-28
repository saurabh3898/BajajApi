package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Controller.UserService;
import com.example.entity.User;

public class UserController {
	
	UserService userservice;
@GetMapping("/bfhl")
	
	public List<User> getAllInfo()
	{
		return userservice.getAllInfo();
	}
}
