package com.Feb24;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Enter Student Data");
	   int choice=0;
	   do {
		   System.out.println("1.Enter Student Information :");
		   System.out.println("2.Enter Student Course Rating :");
		   System.out.println("3.Enter Student Eligibility :");
		   System.out.println("4.Exit :");
		   choice=sc.nextInt();
		   
		   switch(choice)
		   {
		   case 1:
			   System.out.println("Enter Student Name: ");
			   String name = sc.next();
			   System.out.println("Enter Student Age: ");
			   int age = sc.nextInt();
			   System.out.println("Enter Student Address: ");
			   String Address = sc.next();
			   System.out.println("Name : "+name+" \n Age :"+age+" \n Address :"+Address);
               break;
               
		   case 2:
			   System.out.println("Enter Student Course Rating: ");
			   int Rating = sc.nextInt();
			   if(Rating>=10)
			   {
				   System.out.println("Good");
			   }
			   else
			   {
				   System.out.println("Need to improve");
			   }
               break;
               
		   case 3:
			   System.out.println("Enter Student Eligibility: ");
			   int Eligibility = sc.nextInt();
			   if(Eligibility >=50)
			   {
				   System.out.println("The Student will eligible for enroll the course");
			   }
			   else
			   {
				   System.out.println("The Student will not eligible for enroll the course");
			   }
               break;
               
		   case 4:
			   System.out.println("Exit");
			   break;
			default:
			   System.out.println("wrong Input");
               } 
	   }while(choice != 4);
	  
	}
}



	
	
	 
	   


