package task1;
import java.util.Scanner;
//find given string length(With out String class ).

public class Prgm7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		char arr[]=str.toCharArray();
		System.out.println(arr.length);

	}

}
