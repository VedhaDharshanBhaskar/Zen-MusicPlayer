package com.example.sbweb.entities;

public class FormData {
   String username;
   String email;
   String passowrd;
public FormData() {
	super();
	// TODO Auto-generated constructor stub
}
public FormData(String username, String email, String passowrd) {
	super();
	this.username = username;
	this.email = email;
	this.passowrd = passowrd;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassowrd() {
	return passowrd;
}
public void setPassowrd(String passowrd) {
	this.passowrd = passowrd;
}
@Override
public String toString() {
	return "FormData [username=" + username + ", email=" + email + ", passowrd=" + passowrd + "]";
}
   
}
