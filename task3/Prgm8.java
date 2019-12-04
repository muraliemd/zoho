package task3;
// Tokenize a string with a delimiter

import java.util.Scanner;
import java.util.StringTokenizer;

public class Prgm8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("Enter the delimiter:");
		char delimiter= sc.nextLine().charAt(0);
		
		StringTokenizer tokenizer = new StringTokenizer(str,String.valueOf(delimiter));
		
		System.out.println("Tokens:");
		while(tokenizer.hasMoreElements())
		{
			System.out.println(tokenizer.nextToken());
		}

	}

}
