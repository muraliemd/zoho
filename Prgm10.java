package task1;
import java.util.Scanner;

public class Prgm10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1=sc.nextLine();
		
		String s2="";
		
		for(int i=0;i<s1.length();i++)
			s2=s2+s1.charAt(i);
		
		System.out.println("string 2: "+s2);
	}

}
