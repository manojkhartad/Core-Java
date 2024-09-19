// Write a program to convert days to hours
import java.util.Scanner;

public class DaysToHours {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Days");
		int days = scan.nextInt();
		int hours = days * 24;
		int min = days / 24 / 60;
		int sec = days / 24 / 60 / 60;
		System.out.println(hours + "Hrs: " + min + "m: " + sec + "s:");
		

	}

}
