package com.epam_task3;
import java.util.Scanner;
class App extends Operations
{
	void App()
	{
		Scanner s=new Scanner (System.in);
		System.out.println("\n\nEnter the 1st number for Math operation");
		float num1= s.nextFloat();
		System.out.println("Enter the 2nd number for Math operation");
		float num2= s.nextFloat();
		System.out.println("SIMPLE CALCULATOR\nSELECT THE OPERATION\n1.ADD\n2.SUBRACT\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT");
		int operation=s.nextInt();
		switch(operation)
		{
			case 1: System.out.println("After Adding "+num1+" and "+num2+" is "+add(num1,num2));
			break;
			case 2: System.out.println("After Subracting "+num1+" and "+num2+" is "+subract(num1,num2));
			break;
			case 3: System.out.println("After  Multiplying"+num1+" and "+num2+" is "+multiply(num1,num2));
			break;
			case 4: 
			if (num2==0)
			{
				System.out.println("Math Error");
				break;
			}
			else
			{
				System.out.println("After Dividing "+num1+" and "+num2+" is "+divide(num1,num2));
				break;
			}
			case 5: break;
			default:
			System.out.println("ENTER VALID OPTION");
			App();
		}
	}
	public static void main(String args[])
	{
		App obj1=new App();
		obj1.App();
	}
}
