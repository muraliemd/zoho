package task3;

import java.util.Scanner;

//Eliminate a sub string from an string

public class Prgm4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("Enter the Substring :");
		String subString= sc.nextLine();
		
		str=str.replaceAll(subString, "");
		
		System.out.println("Str:"+str);
		

	}

}
