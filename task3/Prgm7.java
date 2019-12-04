package task3;
//Split the string into two/more with a delimiter

import java.util.Scanner;

public class Prgm7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("Enter the delimiter:");
		char delimiter= sc.nextLine().charAt(0);
		
		String result[]=str.split(String.valueOf(delimiter));
		
		System.out.println("Splitted String");
		for(String s:result)
		{
			System.out.println(s);
		}
	}

}
