package com.learning.services;

import java.util.Random;

import com.learning.model.Employee;

public class CredentialServices {
	
	public String generateEmail(Employee employee,String deptt) {
	
		return employee.getFirstName()+employee.getLastName()+"."+deptt+"@abc.com";				
		
	}
	
	public char[] generatePassword() {
		
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      
	      Random random = new Random();
	      char[] password = new char[8];

	     
	   
	      for(int i = 0; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	         
	      }
	      
	      return password;
		
	}
	
	public void showCredential(Employee employee,String deptt) {
		
		System.out.println("Email----> "+generateEmail(employee, deptt));
		System.out.println("Password----> "+generatePassword());
		
		
	}
}