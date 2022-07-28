import java.util.Scanner; 
public class userInput
{
	public static void main (String[] args)
	{
	 Scanner obj = new Scanner(System.in);
	 int userInput = obj.nextInt();
	 for(int i = 1; i <= userInput; i++)
	 {
		System.out.println(i);
		
	 }

	}
}