package com.Array;

import java.util.Scanner;

public class Array3 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter size of array :");
		 int size = sc.nextInt();
		 int arr[]=new int[size];
		 System.out.println("Enter Elements of array :");
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
			 
		 }
		 System.out.println("Array Elements : ");
		 for(int i=0;i<arr.length;i++)
		 {
			System.out.println(arr[i]);
			 
		 }
		
	}

}
