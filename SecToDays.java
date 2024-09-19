import java.util.Scanner;

public class SecToDays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Seconds");
		int sec = scan.nextInt();
		int days = sec / 86400;
		int hours = days / 60 / 60;
		int min = hours % 60;
		// int remainingSec = sec / 86400 / 60 %
		System.out.println("D : " + days + " H : " + hours + " M : " + min);
		scan.close();
	}

}
