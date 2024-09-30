package com.example.demo.UserService;

import java.util.Optional;

import com.example.demo.Advice.UserNotFoundException;
import com.example.demo.UserEntity.User;
import com.example.demo.UserModel.UserModel;

public interface UserService
{
	public User addUser(UserModel userModel);

	public User getUserDetailsById(int userId) throws UserNotFoundException;

}
	