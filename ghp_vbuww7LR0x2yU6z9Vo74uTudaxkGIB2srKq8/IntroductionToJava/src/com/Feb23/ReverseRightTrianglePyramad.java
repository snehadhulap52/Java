package com.Feb23;

import java.util.Scanner;

public class ReverseRightTrianglePyramad {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
