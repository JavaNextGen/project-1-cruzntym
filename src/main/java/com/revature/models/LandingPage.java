
package com.revature.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LandingPage {
	
	String tymOfTheDay;
	String fd;
	
	public void  gettymOfTheDay() {
		LocalDateTime now = LocalDateTime.now(); 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  

		fd = dtf.format(now);	
		 System.out.println(fd);

	System.out.println("The time is " + fd  );
	System.out.println("I hope your are having a gooddday" );

	}

  
	 public void welcomePage() {
		   
	      System.out.println("*-------------------*");
	      System.out.println("Welcome" );
	      gettymOfTheDay();
	      System.out.println("*---------------------*");

	      UserRegistration newuser = new UserRegistration();
	     newuser.getUserDetails();
	     
   }

} 
   

//+------------------------------------------------------------------+
