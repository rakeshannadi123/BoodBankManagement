package com.hcl.bloodmanagement.service.impl;

import javax.swing.JLabel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bloodmanagement.forms.NewPage;
import com.hcl.bloodmanagement.model.UserDetails;
import com.hcl.bloodmanagement.repository.UserRegistrationRepository;
import com.hcl.bloodmanagement.service.UserRegistrationService;
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

	@Autowired
	private UserRegistrationRepository userRegRepository;
	
	public boolean userReg(String firstName, String lastName,String userName,String password,String emailId,String mobileNumber) {
		 //check whether the credentials are authentic or not  
	UserDetails userDet = new UserDetails();
	userDet.setEmail(emailId);
	userDet.setFirstName(firstName);
	userDet.setPassword(password);
	userDet.setLastName(lastName);
	userDet.setUserName(userName);
	userDet.setMobile(mobileNumber);
	
		userRegRepository.save(userDet);
 	            
	          //create instance of the NewPage  
	          NewPage page = new NewPage();  
	            
	          //make page visible to the user  
	          page.setVisible(true);  
	            
	          //create a welcome label and set it to the new page  
	          JLabel wel_label = new JLabel("Welcome: "+userName);  
	          page.getContentPane().add(wel_label);  
	          System.out.println("Registered in");  
	     
		return false;
		
	}
}
