package EmployeeDetail;

import java.util.Scanner;

public class Emp 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Emp Name : ");
		String name = sc.next();
		System.out.println("Enter Emp Address : ");
		String Add = sc.next();
		System.out.println("Enter Emp Designation : ");
		String Desig = sc.next();
		System.out.println("Enter Emp Salary : ");
		int salary = sc.nextInt();
		System.out.println("Emp id :"+id+"\n Emp name :"+name+"\n Emp Add :"+Add+"\n Emp Designation :"+Desig+"\n Emp salary :"+salary);





	}

}
