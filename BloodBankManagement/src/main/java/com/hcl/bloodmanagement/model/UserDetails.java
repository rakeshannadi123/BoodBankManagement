package com.hcl.bloodmanagement.model;


import jakarta.persistence.*;

@Entity
@Table(name = "User_Details")
public class UserDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "firstName",nullable = false)
  private String firstName;

  @Column(name = "lastName",nullable = false)
  private String lastName;

  @Column(name = "email",nullable = false)
  private String email;

  @Column(name = "mobile",nullable = false)
  private String mobile;

  @Column(name = "userName",nullable = false)
  private String userName;

  @Column(name = "password",nullable = false)
  private String password;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "UserDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", mobile=" + mobile + ", userName=" + userName + ", password=" + password + "]";
}
 
  
}
