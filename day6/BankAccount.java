package com.pavan.day6;

import java.util.Scanner;

import com.pavan.day6.Account;

/**
 * program to generate Bank account
 * @author pavan 
 * @since 2nd aug
 */

public class BankAccount {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	   Account acc = null;
	   while(true){
		System.out.println(" 1. new  account ");
		System.out.println(" 2. Deposit");
		System.out.println(" 3. withdraw");
		System.out.println(" 4. Details");
		System.out.println(" 5. exit");
		System.out.println(" enter the option: ");
		int opt =sc.nextInt();
		  
		switch(opt){
		case 1 :if(acc ==null) {
			System.out.println("enter the account number:");
			long acno =sc.nextInt();
			sc.nextLine();
			  System.out.println("enter the name:");
			  String name =sc.next();
			  sc.nextLine();
			  System.out.println("enter the deposit amount:");
			  float amt =sc.nextInt();			
			 acc = new Account(acno,name,amt);
			 System.out.println("WELCOME TO PAVAN BANK OF INDIA");
		}
		else {
			System.out.println(" a/c is already exit ----plese select other options");
		}
			break;
			
		
		case 2:if (acc!=null) {
			System.out.println(" enter the amount:" );
			int amt=sc.nextInt();
			acc.Deposit(amt);
		}
		else {
			System.out.println(" PLEASE OPEN THE ACCOUT WITH US");
		}
			break;
		case 3:if (acc!=null) {
			System.out.println(" enter the amout to withdraw:");
			int amt =sc.nextInt();
			acc.withdraw(amt);
		}
		else {
			System.out.println(" PLEASE OPEN THE ACCOUT WITH US");
		}
			break;
		case 4:
			if (acc!=null) {
				acc.balance();
			}
			else {
				System.out.println(" PLEASE OPEN THE ACCOUT WITH US");
			}
			break;
		case 5:
			System.out.println("application designed by pavan");
			sc.close();
			System.exit(0);
			break;
		
		default:
			System.out.println( "$$$ -------INVALID SELECTION-----TRY AGAIN");
		}
		System.out.println("--------------------------------------------\n");
	} 
	}
}
