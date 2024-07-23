package com.hcl.bloodmanagement;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.hcl.bloodmanagement.forms.UserRegistrationForm;

@SpringBootApplication
public class SpringBootJpaH2Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootJpaH2Application.class, args);
//		System.setProperty("java.awt.headless", "false");
//		ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringBootJpaH2Application.class).headless(false).run(args);
//		CreateLoginForm form = context.getBean(CreateLoginForm.class);
//        form.setSize(300,100);  //set size of the frame  
//        form.setVisible(true);  //make form visible to the user  
//        
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringBootJpaH2Application.class).headless(false).run(args);
        UserRegistrationForm appFrame = context.getBean(UserRegistrationForm.class);
        appFrame.setSize(1500,800);  //set size of the frame  
        appFrame.setVisible(true);  //make form visible to the user  
	}

}
