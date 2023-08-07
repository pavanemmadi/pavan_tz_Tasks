package com.pavan.day4;

public class ObjectTest {
	{
		int empno;
		String name;
		float sal ;
		
		void setDetails(){
		String	name = "Praveen";
		float	sal = 2750.75f;
		}

		
		
	} //Employee

	class ObjectTest1
	{
		public static void main(String[] args) 
		{
			//-- create an instance of Employee type
			Employee emp = new Employee();

			//-- access the state of instance using reference
			System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

			//-- access the state of instance using reference and method
			emp.getDetails();

			//-- change the state of instance using reference
			emp.empno = 101;
			emp.name = "Sanjay";
			emp.sal = 2500f;
			emp.getDetails();

			//-- change the state of instance using reference and method
			emp.setDetails();
			emp.getDetails();
		}


}
