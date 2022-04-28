package com.example.demo.Controller;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



import com.example.entity.User;



public class UserService {
	
	UserService userservice;
@GetMapping("/bfhl")
	
	public List<User> getAllInfo()
	{
		return userservice.getAllInfo();
	}
}
