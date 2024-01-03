package orcle;

import java.util.Scanner;

public class EmployeeDetails {
	
	public static void main(String[]args) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter employee the Id");
	short Id=Sc. nextShort();
	System.out.println("employee Id is +Id");
	
	System.out.println("enter the employee name");
	String name=Sc.nextLine();
	System.out.println("employee name is+name");
	
	System.out.println("enter the employee phoNum");
	Long phoNum=Sc.nextLong();
	System.out.println("employee phoNum is +phoNum");
	
	System.out.println("enter the employee salary");
	Double salary=Sc.nextDouble();
	System.out.println("employee salary is +salary");
	
	System.out.println("enter the employee gender");
	Boolean gender=Sc.nextBoolean();
	System.out.println("employee gender is +gender");
	
	
	

	}

}
