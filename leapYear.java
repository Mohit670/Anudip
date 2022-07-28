// write  a program to print leap years between 1947-2022

public class leapYear 
{
 public static void main (String[] args)
 {
	int year1 = 1947, year2 = 2022;
	for (int i = year1; i <= year2; i++)
	{
		if(i%4==0)
		{
			System.out.println(i);
		}
	}
 } 
}