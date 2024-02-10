package stackParenthesis;

import java.util.Scanner;

public class driverApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Expression :");
		String input=sc.next();
		
		myStack ms=new myStack();
		if(input.length()%2==1)
		{
			System.out.println("The entered Expression is Incomplete.");
		}
		else
		{
			if(ms.validate(input))
				System.out.println("The entered Expression is Valid.");
			else
				System.out.println("The enterd Expression is Invalid.");
		}
	}
}