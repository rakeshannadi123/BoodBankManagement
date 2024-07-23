package com.hcl.bloodmanagement.service.impl;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bloodmanagement.forms.NewPage;
import com.hcl.bloodmanagement.model.UserDetails;
import com.hcl.bloodmanagement.repository.LoginRepository;
import com.hcl.bloodmanagement.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	private JButton btnNewButton;
	public boolean login(String userValue, String passValue) {
		 //check whether the credentials are authentic or not  
		UserDetails user = loginRepository.findUserByNameAndPassword(userValue,passValue);
 	      if (user!=null && userValue.equals(user.getUserName()) && passValue.equals(user.getPassword())) {  //if authentic, navigate user to a new page  
	            
	          //create instance of the NewPage  
	          NewPage page = new NewPage();  
	            
	          //make page visible to the user  
	          page.setVisible(true);  
	            
	          //create a welcome label and set it to the new page  
	          JLabel wel_label = new JLabel("Welcome: "+userValue);  
	          page.getContentPane().add(wel_label);  
	          System.out.println("Logged in");  
	      }  
	      else{  
	          //show error message  
	          System.out.println("Please enter valid username and password");  
	          JOptionPane.showMessageDialog(btnNewButton, "Enter a valid password");
	      }  
		return false;
		
	}
}
