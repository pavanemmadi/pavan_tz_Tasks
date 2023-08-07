package com.pavan.day5;
/**
 * program to generate students details
 * @author pavan 
 * @since 1st aug
 */

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter the students id :" );
		    int id =sc.nextInt();
		    
		    System.out.print("enter the student name:");
		     String name =sc.next();
		     System.out.print("enter the student address:");
		     String address=sc.next();
		     System.out.print("college name  :");
		     String college=sc.next();
		 
			    
		      
			System.out.println();
			System.out.println(" student id :" +"\t" +id);
			System.out.println(" Name       :" +"\t"+name);
			System.out.println(" Addres     :" +"\t"+address);
			
			System.out.println(" collage name:" +"\t"+college);
			
			
			}

	}


