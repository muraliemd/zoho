package task1;
import java.util.Scanner;
//Copy a String to another

public class Prgm10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1=sc.nextLine();
		
		String str2="";
		
		for(int i=0;i<str1.length();i++)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println("String 1:"+str1+"\nString 2:"+str2);
	}

}
