package com.edubridge.datatypes;

public class InstanceVariable
{ 
	int id = 120;
	static int i = 500;
	static String name = "mona";
	 
	void disp() 
	{
		String Companyname = "TCS";
		System.out.println(Companyname);
	}
	void show()
	{
		System.out.println(id);
	}
	public static void main(String[]args)
	{
		InstanceVariable v1 = new InstanceVariable(); 
		v1.disp();
		v1.show();
		System.out.println(InstanceVariable.i);
		System.out.println(InstanceVariable.name);
		
	}
	

	

}
