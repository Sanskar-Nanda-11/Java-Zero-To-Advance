package com.packages.project.bankproject;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(" Welcome Account Holder ");
    accountholderoptions();
    }
  
  static void accountholderoptions() {
    Account_operator bank = new Account_operator();
    System.out.println(" Choose Your Operations From Below");
    System.out.println(" 1 : Deposit ");
    System.out.println(" 2 : Withdraw ");
    System.out.println(" 3 : View Balance ");
    System.out.println(" 4 : Exit ");
    Scanner operation = new Scanner(System.in);
    int value = operation.nextInt();
    int user_updated_balance;
    
    switch (value) {
      
    case 1:
      System.out.println(" Enter Your Amount To Deposit ");
      user_updated_balance = operation.nextInt();
      if(user_updated_balance >= 1) {
        bank.deposit(user_updated_balance);
        System.out.println(" Your Amount Is Deposited " + user_updated_balance + " And updated your bank balance " + bank.getUser_balance());
      }else {
        System.err.println(" Plese enter a valid amount ");
      }
      accountholderoptions();
      
    case 2:
      if(bank.getUser_balance() == 0) {
        System.err.println(" You Can not withdraw this amount , plese try by entering other value ");
      }else {
        System.out.println(" Enter A Value That You Will Be Debit " );
        user_updated_balance = operation.nextInt();
        if(user_updated_balance >= 0) {
          System.out.println(" You Cant Withdraw This Type Amount");
        }else if(user_updated_balance < user_updated_balance) {
          System.out.println(" Your Balance is Low , Plese Withdraw From Available Balance ");
          System.out.println(" Your Balance Is :- " + bank.getUser_balance());
        }else {
          bank.withdraw(user_updated_balance);
          System.out.println(user_updated_balance + " Rs Withdrawn , Now Updated Balance is " + bank.getUser_balance());
        }
      }
      accountholderoptions();
      break;
    case 3:
      System.out.println(" Here is your balance " + bank.getUser_balance());
      accountholderoptions();
      break;
      
    case 4:
      System.out.println(" Thank You , Visit Us Again ");
      break;
      
      default:
        System.err.println(" Enter A Valid Value From Choosing Above Options ");
        break;
    }
    operation.close();
  }

}