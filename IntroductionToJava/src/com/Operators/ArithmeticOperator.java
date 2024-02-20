package com.Operators;
import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x and y :");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println(x%y);

	}

}
