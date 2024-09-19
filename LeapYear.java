import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year");
		int x = scan.nextInt();
		if (x % 4 == 0)
		{
			if (x % 100 == 0)
			{
				if (x % 400 == 0)
				{
					System.out.println(x + " : is a leap year");

				}
				else
				{
					System.out.println(x + ": is a leap year");

				}
			}
			else
			{

				System.out.println(x + ": is not a leap year");
			}

		}
	}
}





