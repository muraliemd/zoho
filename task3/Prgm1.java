package task3;
import java.util.Scanner;

//compare 2 strings with and without ignoring case 

public class Prgm1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1:");
		String s1= sc.next();
		System.out.println("Enter the String 2:");
		String s2= sc.next();
		
		System.out.println("1.Without Ignore case 2.With Ignore case");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				s2=s2.toLowerCase();
				s1=s1.toLowerCase();
			case 2:
				System.out.println(s1.compareTo(s2)==0?"Equal":"Not Equal");
		}
		

	}

}
