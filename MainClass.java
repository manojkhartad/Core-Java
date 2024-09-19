import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if (num % 3 == 0 && num % 5 == 0)
		{
			System.out.println("Jar");
		
		}
		else if (num % 3 == 0)
		{
		System.out.println("Zip");	
		}
		else if (num % 5 == 0)
		{
			System.out.println("Zap");
			
		}
		else
		{
			System.out.println("Done");
		}
	}

}
