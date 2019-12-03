package task1;
// print the Fibonacci series   

import java.util.Scanner;
public class Prgm4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		System.out.println("Fibonaci Series: ");
		fib(number);
	}

	static void fib(int number)
	{
		if(number<1)
		{
			System.out.println("Not a valid number");
		}
		
		int firstNumber=0,secondNumber=1;
		System.out.print(firstNumber+" ");
		
		if(number>1)
		{
			System.out.print(secondNumber+" ");
		}
		
		while(number-->2)
		{
			int thirdNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
			System.out.print(thirdNumber+" ");
		}
	}

}
