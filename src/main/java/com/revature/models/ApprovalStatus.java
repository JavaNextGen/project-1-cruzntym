
package com.revature.models;

import java.util.Scanner;


public class ApprovalStatus {

   AbstractUser newAbs = new AbstractUser();
   AbstractReimbursement newRe = new AbstractReimbursement();

   public void requestReimbursement() {
      try( Scanner re = new Scanner(System.in)) {
         System.out.println("Confirm request: enter 1");
         int reimR = re.nextInt();
         if(reimR == 1) {
            System.out.println("Enter Amt");
            double amt = re.nextDouble();
            newRe.setAmount(amt);
            System.out.println(newRe.getAmount());
         }
      }
     catch(Exception e) {
 	  System.out.println("");
     }
   }

   
   public void getApprovalStatus() {

      try( Scanner ma = new Scanner(System.in)) {
         System.out.println("Enter Status");
         String reimbusementstatus = ma.nextLine();

         if(reimbusementstatus.equals("PENDING")) {
            newRe.setStatus(Status.PENDING);
         } else {
            if(reimbusementstatus.equals("APPROVED")) {
               newRe.setStatus(Status.APPROVED);
            } else {
               if(reimbusementstatus.equals("DENIED")) {
                  newRe.setStatus(Status.DENIED);
               }
            }
         }
      }
      
      catch(Exception e) {
    	  System.out.println("");
      }
      System.out.println(newRe.getStatus());
   }

   public void checkStatus() {
          System.out.println(newRe.getStatus());
   }

   public void ApproveRequest() {
      try( Scanner br = new Scanner(System.in)) {

         System.out.println("change approval status, 1 to pend");
         System.out.println(" 1 to pend");
         System.out.println(" 2 to approve");
         System.out.println(" 3 to denied");

         int response = br.nextInt();

         if(response == 1) {
            newRe.setStatus(Status.PENDING);
         } else {
            if(response == 2) {
               newRe.setStatus(Status.APPROVED);
            } else {
               if(response == 3) {
                  newRe.setStatus(Status.DENIED);
               }
            }
         }

         System.out.println(newRe.getStatus());
      }
      catch(Exception e) {
    	  System.out.println("");
      }
   }
   AbstractUser newAbstU = new AbstractUser();
   AbstractReimbursement newAbstRei = new AbstractReimbursement();
  
 
}



//+------------------------------------------------------------------+
