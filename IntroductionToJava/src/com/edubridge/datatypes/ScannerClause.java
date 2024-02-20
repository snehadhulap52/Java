package com.edubridge.datatypes;
import java.util.Scanner;

public class ScannerClause
{
   public static void main(String[]args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter product name :");
	   String pname = sc.nextLine();
	   System.out.println("Enter Quantity :");
	   int Quantity = sc.nextInt();
	   System.out.println("Enter price :");
	   int city = sc.nextInt();
	   System.out.println("product name"+pname+" \nQuantity"+Quantity+"\n price"+city);
   }
}
