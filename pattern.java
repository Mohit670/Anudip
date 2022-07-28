//write a program to following pattern- 9, 19, 29, 39, 49......129

public class pattern
{
 public static void main(String[] args)
 {
	for(int i = 10; i < 140; i++)
	{
		System.out.println(i-1);
		i = i+9;
		
	}
 }

}