package com.learning.driver;

import java.util.Scanner;

import com.learning.model.Employee;
import com.learning.services.CredentialServices;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="",last_name="";
		
		Scanner sc=new Scanner(System.in);
		boolean valid=false;
		
		if(!valid) {
		System.out.println("Enter First Name");
		 name=sc.next();
		
		System.out.println("Enter Last Name");
		 last_name=sc.next();
		}
		
		CredentialServices credentialServices=new CredentialServices();
		Employee employee=new Employee(name,last_name);		
		
		System.out.println("Please Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option=0;
		try {		 
		
		do {
			option=sc.nextInt();
		switch(option) {
		case 1 :
			
			System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
			credentialServices.showCredential(employee, "tech");
			valid=true;
			break;
			
		case 2 :
			credentialServices.showCredential(employee, "admin");
			
			valid=true;
			break;
			
		case 3 :
			credentialServices.showCredential(employee, "hr");			
			valid=true;
			break;
		case 4 :
			credentialServices.showCredential(employee, "legal");
			
			valid=true;
			break;
		 default: 
			 valid =false;
			 throw new IllegalStateException("Enter valid input");
			
		}
		}while(option !=4);
		}catch (Exception e) {
			valid =false;
			// TODO: handle exception
			System.out.println("Enter Digit only");
		}
		
		
	
		

	}

}
