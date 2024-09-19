// Write a program to find the biggest number among the three given numbers.

import java.util.Scanner;

public class Biggest 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = scan.nextInt();
		System.out.println("Enter number 3: ");
		int num3 = scan.nextInt();
		
		if (num1 == num2 && num2 == num3)
		{
			System.out.println("Three numbers are equal");
		}
		else
		{
		if (num1 > num2)
		{
			if (num1 > num3)
				System.out.println("Number 1 is the Biggest Number");
			else
				System.out.println("Number 3 is the Biggest Number");
		}
		else
			{
			if (num2 > num3)
				
				System.out.println("Number 2 is the Biggest Number");
			else
				System.out.println("Number 3 is the Biggest Number");
			}
			
		}
		

	}

}
