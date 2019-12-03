package task2;
import java.util.Scanner;
//concatenate 2 strings

public class Prgm1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String s1=sc.nextLine();
		System.out.println("Enter the String 2:");
		String s2=sc.nextLine();
		
		s1+=s2;
		
		System.out.println("Output String:"+s1);
	}
}
