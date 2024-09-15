package com.example.sbweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.sbweb.entities.Users;
import com.example.sbweb.services.UsersServices;

@Controller
public class UsersController
{   
	@Autowired
	UsersServices userv;
	
   @PostMapping("/register")
   public String addUser(@ModelAttribute Users user)
 {
	   boolean userstatus = userv.emailExists(user.getEmail());
	   if(userstatus == false)
	   {
		   userv.addUsers(user);
		   return "registersuccess";
	   }
	   else
	   {
		   return "registerfail";
	   }
	   
 }
   @PostMapping("/login")
   public String validateUser(@RequestParam String email,@RequestParam String password)
   { 
	  
	  if( userv.validateUser(email, password) == true)
	  {   
		  if(userv.getRole(email).equals("admin"))
		  {
			  return "adminhome";
		  }
		  else
		  {
		  return "customerhome";
		  }
	  }
	  else
	  {
		  return "loginfail";
	  }
   }
}
