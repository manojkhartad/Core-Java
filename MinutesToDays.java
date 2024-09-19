/*
 * Write a program to take the input as minutes
 * and convert into days : hours : minutes format.
 * ex: 3124 minutes = 2d : 4h : 4m
 */

import java.util.Scanner;

public class MinutesToDays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minutes");
		int minutes = scan.nextInt();
		
		int days = minutes / 60 / 24; 
		int hours = minutes / 60 % 24;
		int remainingMinutes = minutes % 60;
		
		System.out.println(days + "d : " + hours + "h : " + remainingMinutes + "m");
		

	}

}
