package com.Array;

public class SumOfArray {

	public static void main(String[] args) 
	{
		int []arr= new int[] {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum of array elements is :"+sum);

	}

}
