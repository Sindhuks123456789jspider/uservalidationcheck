package com.example.demo.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.Data;



@Data
@Entity
@Table(name = "app_user") 
public class User 
{
	@Id
	@GeneratedValue
	private int userId;
	@jakarta.validation.constraints.NotNull(message = "user name should not be null")
	private String userName;
	@Email(message = "please prive valid emailid")
	private String userEmail;
	private String userGender;
	@Pattern(regexp = "^\\d{10}$", message="must be 10 digits only")
	private String UserNumber;
	@Min(value = 18, message = "Age should be greater than or equal to 18.")
	@Max(value = 60, message = "Age should be less than or equal to 60.")
	private int age;
	private String userNationallity;

}
