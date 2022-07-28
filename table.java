// Write a program to print tables (read two inputs from user first one for table and second for // limit) ex 2*1=2;
import java.util.Scanner;
public class table
{
	static Scanner obj = new Scanner(System.in);	
	public static void main(String[] args)
	{

		System.out.println("Enter the Number for Table");
		int number = obj.nextInt();
		System.out.println("Enter the Limit for Table");
		int limit = obj.nextInt();
		for(int i = 1; i <= limit; i++)
		{
			System.out.println(number * i);
		}
	}
}