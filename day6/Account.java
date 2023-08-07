package com.pavan.day6;
/**
 * program to generate bank account
 * @author pavan 
 * @since 2nd aug
 */

public class Account {
	private long acno ;
    private String name ;
    private float bal ;
	public Account(long acno, String name, float sal) {
		
		this.acno = acno;
		this.name = name;
		this.bal = sal;
	}
     public void Deposit(float amt)  {
    	 this.bal= this.bal+amt;
    	 System.out.println("Rs." + amt + "credited | balance " + this.bal);
    	 
     }
     public void withdraw(float amt) {
    	 if (this.bal>=amt) {
    	 this.bal=this.bal-amt;
    	 System.out.println("Rs." + amt + "debit | balance " + this.bal);
    	 
    	 }
    	 else {
    		 System.out.println("ERROR; INVALID AMOUNT");
    		 
    	 }
     }
    	 
     public void balance () {
    	 System.out.println("account number ="+ this.acno +"/t"+"name "+ this.name+  "/t" +"  balance=" +this.bal );
    	 
    	 
    	 
     }
    	 

}
