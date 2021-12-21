
package com.revature.models;

import java.util.Scanner;

public class GetUserDetails {

   public void getUserDetails() {
      ApprovalStatus newSt = new ApprovalStatus();
      AbstractUser newAbsUser = new AbstractUser();
    
  
    try (Scanner sc = new Scanner(System.in)) {
    		  
         if ((newAbsUser.getRole()).equals(Role.EMPLOYEE)) {
       
            System.out.print("Select an option: ");
            System.out.print("1 to submit request");
            System.out.print("2 to check Status");
            
            int desire =  sc.nextInt();
            if(desire == 1)
               newSt.requestReimbursement();
            if(desire == 2)
               newSt.checkStatus();
         }

         else {
        	  if ((newAbsUser.getRole()).equals(Role.FINANCE_MANAGER)) {
               
               System.out.print("Select an option:");
               System.out.print("1 to submit request");
               System.out.print("2 to check status");
               System.out.print("3 to approve");
               
               int desire =  sc.nextInt();
               if(desire == 1)
                  newSt.requestReimbursement();
               if(desire == 2)
                  newSt.checkStatus();
               if(desire == 3)
            	   newSt.ApproveRequest();
            }
         }
         
        
    }
      catch(Exception e) {
   	  System.out.println("");
     }
      
   }
   
   
}
//+------------------------------------------------------------------+
