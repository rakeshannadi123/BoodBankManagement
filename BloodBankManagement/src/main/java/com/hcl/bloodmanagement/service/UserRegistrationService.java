package com.hcl.bloodmanagement.service;

public interface UserRegistrationService {
	public boolean userReg(String firstName, String lastName,String userName,String password,String emailId,String mobileNumber);
}
