package com.String;

import java.util.Scanner;

public class login {

	public static void main(String[] args) 
	{
		String name= "sneha";
		System.out.println(name);
		String s = new String("good evening");
		System.out.println(s);
		char ch[]={'m','u','m','b','a','i'};
		String s1 = new String(ch);
		System.out.println(s1);
		System.out.println("size of String:"+s1.length());
		String fname= "anjali";
		String lname="jadhav";
		System.out.println(fname + lname);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String username = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		if(username.equals("sneha") && password.equals("anjali")){
			System.out.println("u can login");
		}
		else
		{
			System.out.println("login failed");
		}

	}

}
