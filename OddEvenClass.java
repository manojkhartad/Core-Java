// Write a program to check whether the number entered by user is odd or even

import java.util.Scanner;

public class OddEvenClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = scan.nextInt();
		if ( x % 2 == 0)
		{
			System.out.println( x + " : Even Number");
			
		}
		else
		{
			System.out.println( x+ " : Odd Number");
		}
	}

}
