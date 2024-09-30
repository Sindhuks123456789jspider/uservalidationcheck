package com.example.demo.UserController;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Advice.UserNotFoundException;
import com.example.demo.UserEntity.User;
import com.example.demo.UserModel.UserModel;
import com.example.demo.UserService.UserService;

import jakarta.validation.Valid;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/path")
	public UserModel postMethodName(@RequestBody @Valid UserModel userModel)
	{
		userService.addUser(userModel);
		return userModel;
	}
	@GetMapping("/getpath/{userId}")
	public User getMethodName(@PathVariable int  userId) throws UserNotFoundException 
	{
		
		
		return userService.getUserDetailsById(userId) ;
		
	}
	

}
