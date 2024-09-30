package com.example.demo.UserServiceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Advice.UserNotFoundException;
import com.example.demo.UserEntity.User;
import com.example.demo.UserModel.UserModel;
import com.example.demo.UserRepository.UserRepository;
import com.example.demo.UserService.UserService;

@Service
public class UserServiceImplementation implements UserService 
{
	@Autowired
	UserRepository repository;

	@Override
	public User addUser(UserModel userModel)
	{	
		User user = new User();
		user.setUserName(userModel.getUserName());
		user.setUserEmail(userModel.getUserEmail());
		user.setUserGender(userModel.getUserGender());
		user.setAge(userModel.getAge());
		user.setUserNationallity(userModel.getUserNationallity());
		user.setUserNumber(userModel.getUserNumber());
		repository.save(user);
		return user;
	}

	@Override
	public User getUserDetailsById( int userId) throws UserNotFoundException
	{
		
		 return repository.findById(userId)
			        .orElseThrow(() -> new UserNotFoundException("Sorry, user not found with ID: " + userId));
		
		
	}

}
