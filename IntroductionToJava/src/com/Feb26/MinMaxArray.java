package com.Feb26;

public class MinMaxArray {                                        

	public static void main(String[] args) 
	{ 
		int[] array = {5, 12, 9, 18, 3, 21}; 
		int max = array[0]; 
		int min = array[0]; 
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				}
			if (array[i] < min) {
				min = array[i]; 
				}
			}
		System.out.println("Maximum value of Array : " + max);
	    System.out.println("Minimum value of Array : " + min);
		}
	}


