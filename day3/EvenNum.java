package com.pavan.day3;

import java.util.Scanner;

/**
 * program to generate even number
 * @author pavan 
 * @since 28th july
 */

public class EvenNum {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in) ;
		
		System.out.print("enter the Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	}


