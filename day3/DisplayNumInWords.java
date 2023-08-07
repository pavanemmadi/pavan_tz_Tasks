package com.pavan.day3;

import java.util.Scanner;

/**
 * program to generate  number in words
 * @author pavan 
 * @since 28th july
 */
public class DisplayNumInWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter the number:");
		  int num = sc.nextInt();
		  int x,y,z =0;
		   String english[] = {"zero","one","two","three","four","five","six","seven", "eight", "nine"} ;
		    if (num<10)
		    { 
		    	System.out.println(english[num]);
		    }
		    else if(num<100)
		    {   x =num/10;
		      y =num%10;
		    System.out.println(english[x]+ " " +english[y]);
		    }
		    else if (num<1000)
		    {
		    	x=num/100;
		    	y=num%100/10;
		    	z=num%10;
		    	System.out.print(english[x]+" "+english[y]+" "+english[z]);
		    }
		

		}

		

	}


