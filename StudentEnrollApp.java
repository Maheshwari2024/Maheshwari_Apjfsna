package com.exe;

import java.util.Scanner;

public class StudentEnrollApp {
	//we enroll the student if income is less than 5lak and they must complete their degree
	void enroll(int income,String status) throws Exception{
		
		if(income>500000) 
			throw new ConditionNotSatisfiedException("Condition Not Satisfied");
		
		else if(status.equalsIgnoreCase("no"))
		throw new  ConditionNotSatisfiedException("Condition Not Satisfied");
		
		System.out.println("Student enrolled into the Batch");
			
	}

	public static void main(String[] args) throws Exception{
	     Scanner sc=new Scanner(System.in);
		StudentEnrollApp student = new StudentEnrollApp();
		System.out.println("Enter Annual income:");
		
		int income=sc.nextInt();
		
		System.out.println("Is your Degree Completed:yes/no");
		
		try {
		String status=sc.next();
		student.enroll(income, status);
		}catch (ConditionNotSatisfiedException e){
			System.out.println("You are not Eligible for this Enrollment"+e);
			
		}
		
		sc.close();
	}

}
