package com.example.demo.UserModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserModel
{
	 @jakarta.validation.constraints.NotNull(message="user name should not be null")
		private String  userName;
		@Email (message="please prive valid emailid")
		private String userEmail;
		private String userGender;
		@Pattern(regexp="^\\d{10}$")
		private String UserNumber;
		@Min(18)
		@Max(60)
		private int age;
		@NotBlank(message=" null not  allowed")
		private String userNationallity;

}
