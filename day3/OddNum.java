package com.pavan.day3;

import java.util.Scanner;

public class OddNum {

	public static void main(String[] args) {

		
			int number, i;
		Scanner	sc = new Scanner(System.in);
			
			System.out.print(" Please Enter any Number : ");
			number = sc.nextInt();	
			
			for(i = 1; i <= number; i++)
			{
				if(i % 2 != 0)
				{
					System.out.print(i +"\t"); 
				}
			}	
		

	}

}
