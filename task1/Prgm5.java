package task1;
//Factorial of n numbers

import java.util.Scanner;
public class Prgm5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		System.out.print("Fact of ");
		System.out.println(fact(number));
	}
	
	static int fact(int number)
	{
		if(number<1)
		{
			System.out.print(number+" is ");
			return 0;
		}
		
		if(number==1)
		{	
			System.out.print(number+" is ");
			return 1;
		}
		
		System.out.print(number+"*");
		return number*fact(number-1);
	}
}
