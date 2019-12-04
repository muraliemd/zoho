package task3;

import java.util.Scanner;

//Find & replace an sub string from an given string .

public class Prgm6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("Enter the Substring to be find:");
		String findSubString= sc.nextLine();
		System.out.println("Enter the Substring to be replaced:");
		String replaceSubString=sc.nextLine();
		
		str=str.replaceAll(findSubString,replaceSubString);
		
		System.out.println("Str:"+str);

	}

}
