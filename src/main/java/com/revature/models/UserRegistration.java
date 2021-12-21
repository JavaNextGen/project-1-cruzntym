package com.revature.models;

import java.util.Scanner;

public class UserRegistration {

   public void getUserDetails() {
      AbstractUser newAbsUser = new AbstractUser();
    
      try (Scanner sc = new Scanner(System.in)) {

         System.out.println("Enter Username");
         newAbsUser.setUsername(sc.nextLine());

         System.out.println("Enter Password");
         newAbsUser.setPassword(sc.nextLine());

         System.out.println("Select a Role: 1 for employee, 2 for Finance manager");
         int role = sc.nextInt();

         if (role == 1) {
            newAbsUser.setRole(Role.EMPLOYEE);
         }
         
         else {
            if (role == 2) {
               newAbsUser.setRole(Role.FINANCE_MANAGER);
            }
         }
         
         System.out.println("Enter Id");
         newAbsUser.setId(sc.nextInt());
        
         
      }
      catch(Exception e) {
    	  System.out.println("");
      }
      
      
      System.out.println(newAbsUser.getId());
      System.out.println(newAbsUser.getUsername());
      System.out.println(newAbsUser.getPassword());
      System.out.println(newAbsUser.getRole());
    //  System.out.println(newAbstR.getAmount());
     

    User newUsr = new User(newAbsUser.getId(),newAbsUser.getUsername(), newAbsUser.getPassword(),newAbsUser.getRole()); 
       System.out.println(newUsr);
       AbstractReimbursement newAbtRe = new AbstractReimbursement();
       System.out.println(newAbtRe);
       
       AbstractUser newAbstU = new AbstractUser();
       AbstractReimbursement newAbstRei = new AbstractReimbursement();
       Reimbursement newReim =
       new Reimbursement(newAbstU.getId(), newAbstRei.getStatus(), newAbstRei.getAuthor(), newAbstRei.getResolver(), newAbstRei.getAmount());
       System.out.println(newReim);
     
   }
   
   
}
//+------------------------------------------------------------------+
