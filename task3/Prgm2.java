package task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//find number of occurrence of sub string

public class Prgm2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str= sc.nextLine();
		System.out.println("Enter the Substring :");
		String subString= sc.nextLine();
		
	    Matcher matcher = Pattern.compile(subString).matcher(str);
	    int count=0;
	    
	    while(matcher.find())
	    {
	    	count++;
	    }
	    
	    System.out.println("Count of the substring = "+count);

	}

}
