package task1;
import java.util.Scanner;
//Find the given string is palindrome or not

public class Prgm6 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str= sc.nextLine();
		
		str=str.toLowerCase();  //Remove this for case sensitive
		
		int l=0,r=str.length()-1;
		
		while(l<r)
		{
			if(str.charAt(l++)!=str.charAt(r--))
			{
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
	}

}
