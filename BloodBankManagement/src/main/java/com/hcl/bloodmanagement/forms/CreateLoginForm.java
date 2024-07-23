package com.hcl.bloodmanagement.forms;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import required classes and packages  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.bloodmanagement.service.LoginService;  
//create CreateLoginForm class to create login form  
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
@Component
public class CreateLoginForm extends JFrame implements ActionListener  
{  
  //initialize button, panel, label, and text field  
  JButton b1;  
  JPanel newPanel;  
  JLabel userLabel, passLabel;  
  final JTextField  textField1, textField2;  
  @Autowired
   LoginService loginService;
  //calling constructor  
 public CreateLoginForm()  
  {     
        
      //create label for username   
      userLabel = new JLabel();  
      userLabel.setText("Username");      //set label value for textField1  
        
      //create text field to get username from the user  
      textField1 = new JTextField(15);    //set length of the text  

      //create label for password  
      passLabel = new JLabel();  
      passLabel.setText("Password");      //set label value for textField2  
        
      //create text field to get password from the user  
      textField2 = new JPasswordField(15);    //set length for the password  
        
      //create submit button  
      b1 = new JButton("SUBMIT"); //set label to button  
        
      //create panel to put form elements  
      newPanel = new JPanel(new GridLayout(3, 1));  
      newPanel.add(userLabel);    //set username label to panel  
      newPanel.add(textField1);   //set text field to panel  
      newPanel.add(passLabel);    //set password label to panel  
      newPanel.add(textField2);   //set text field to panel  
      newPanel.add(b1);           //set button to panel  
        
      //set border to panel   
      add(newPanel, BorderLayout.CENTER);  
        
      //perform action on button click   
      b1.addActionListener(this);     //add action listener to button  
      setTitle("LOGIN FORM");         //set title to the login form  
  }  
    
  //define abstract method actionPerformed() which will be called on button click   
  public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
  {  
      String userValue = textField1.getText();        //get user entered username from the textField1  
      String passValue = textField2.getText();        //get user entered pasword from the textField2  
//        LoginService loginService = new LoginService();
     loginService.login(userValue, passValue);
  }  
}