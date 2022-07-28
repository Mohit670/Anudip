// write a program to print sum of odd numbers till N
import java.util.Scanner;
public class oddNumber
{
	static Scanner obj = new Scanner(System.in);
  public static void main(String[] args)
	{
		System.out.println("Please enter the last Odd number");
		int last = obj.nextInt();
		for(int i = 1; i <= last; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}	
	}
}