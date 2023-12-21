import java.util.Scanner;
public class Positive{
	public static void main(String args[])
	{
		System.out.print("Enter a number:");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		String result = num > 0 ? "Positive number" : "Negative number";
		System.out.println("Entered number is a "+ result);
	}
}
