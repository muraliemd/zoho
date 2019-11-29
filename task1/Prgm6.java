package task1;
import java.util.Scanner;

public class Prgm6 {

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s= sc.nextLine();
		sc.close();
		s.toLowerCase();  //Remove this for case sensitive
		int l=0,r=s.length()-1;
		while(l<r)
		{
			if(s.charAt(l++)!=s.charAt(r--))
			{
				System.out.println("Not a palindrome");
				return;
			}
		}
		
		System.out.println("Palindrome");
		

	}

}
