package task3;

import java.util.Scanner;
// replace an char with an given char in an string

public class Prgm5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character to be find : ");
		char find= sc.nextLine().charAt(0);
		
		System.out.println("Enter the character to be replaced : ");
		char replace = sc.nextLine().charAt(0);
		
		str=str.replaceAll(String.valueOf(find), String.valueOf(replace) );
		
		System.out.println("String :"+str);
	}

}
