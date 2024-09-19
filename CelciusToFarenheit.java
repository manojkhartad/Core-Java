// Write a program to convert the Celcius value to Fahrenheit value

import java.util.Scanner;
public class CelciusToFarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Celcius Value");
		double c = scan.nextDouble();
		double f = (9/5) * c + 32;
		System.out.println("Farenheit = " +f);
		
	}

}
