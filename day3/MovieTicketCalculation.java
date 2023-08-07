package com.pavan.day3;

import java.util.Scanner;

/**
 * program to generate even number
 * @author pavan  kumar
 * @since 28th july
 */
public class MovieTicketCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("how many number of pizzas:");
		 int pizza = sc.nextInt();
		 
		 System.out.print("how many number of puffs:");
		 int puffs = sc.nextInt();
		 
		 System.out.print("how many number of drinks;");
		 int drinks =sc.nextInt();
		 
		 System.out.println("Bill Details");
		 System.out.println("number of pizzas:" +pizza);
		 System.out.println("number of puffs;" +puffs);
	     System.out.println("number of drinks:" +drinks);
		 
		 int total =(pizza*100)+(puffs*20)+(drinks*10);
		 
		System.out.println("total price:" +total);
		System.out.println("ENJOY THE DAY!!!!!");

		}


	

}
