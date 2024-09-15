package com.example.sbweb.services;

import com.example.sbweb.entities.Users;

public interface UsersServices 
{
  public String addUsers(Users user);
  public boolean emailExists(String email);
  
  public boolean validateUser(String email, String password);
  
  public String getRole(String email);
}
