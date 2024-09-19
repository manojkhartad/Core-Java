// Write a program to check whether the entered number by user is Armstrong number or not.
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = scan.nextInt();
		armstrongNumber(num);
	
	}
	private static void armstrongNumber(int num) {
		
		String str = String.valueOf(num);
		int len = str.length();
		int temp = num;
		int sum = 0;
		
		while ( num > 0 ) {
			int r = num % 10;
			sum = sum + (int) Math.pow(r,  len);
			num = num / 10;
					
		}
		if ( sum == temp) {
			System.out.println(temp + ": is an armstrong number");
		}
		else
			System.out.println(temp + ": is not an armstrong number");
	}

}
