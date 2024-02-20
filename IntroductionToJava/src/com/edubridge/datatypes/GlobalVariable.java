package com.edubridge.datatypes;

public class GlobalVariable {
		String ename= "Chakuli";
		
		void Info1() {
		int empid = 11221;
		System.out.println(ename +"  " +empid);
		}
		
		void Info2() {
			String empDesignation = "Java Developer";
			System.out.println(ename+"  "+empDesignation);
		}
		  public static void main(String[] args) 
			{
				GlobalVariable  G1 = new GlobalVariable();
				G1.Info1();
				G1.Info2();
			}
					
		
}


