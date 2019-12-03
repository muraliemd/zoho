package task1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//check the input character for uppercase, lowercase, no. of digits and Special chars

public class Prgm9 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		int strLength=str.length();
		
		int splChar=0,digits=0,lowerCase=0,upperCase=0;
		
		
		
		
		/*while(strLength-->0)
		{
			if(str.charAt(strLength)>=65 && str.charAt(strLength)<=90)  //ASCII value for A-Z 
			{
				upperCase++;
			}
			else if(str.charAt(strLength)>=97 && str.charAt(strLength)<=122)   //ASCII value for a-z
			{
				lowerCase++;
			}
			else if(str.charAt(strLength)>=48 && str.charAt(strLength)<58)		//ASCII value for digits
			{
				digits++;
			}
			else
			{
				splChar++;
			}
		}
		
		System.out.println("Splchar="+splChar+"\nDigits="+digits+"\nlowerCase="+lowerCase+"\nUpperCase="+upperCase);*/
		
		
		//Regex
		Pattern p = Pattern.compile("//d");
	    Matcher m = p.matcher(str);
		
	     
		
		
		String s[]=str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)|(?<=[a-z]+)(?=[^a-z]+)|(?<=[^a-z]+)(?=[a-z]+)|(?<=[A-Z]+)(?=[^A-Z]+)|(?<=[^A-Z]+)(?=[A-Z]+)");
	    
		
		for(String i:s)
		{
			System.out.println(i);
		}
		
	    for(String i:s)
		{
			if(Pattern.matches("[0-9]*", i))
			{
				digits+=i.length();
			}
			else if(Pattern.matches("[A-Z]*", i))
			{
				upperCase+=i.length();
			}
			else if(Pattern.matches("[a-z]*", i))
			{
				lowerCase+=i.length();
			}
			else
				splChar+=i.length();
				
		}
		System.out.println("Splchar="+splChar+"\nDigits="+digits+"\nlowerCase="+lowerCase+"\nUpperCase="+upperCase);

	}

}
