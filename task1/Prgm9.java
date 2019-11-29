package task1;
import java.util.Scanner;

public class Prgm9 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thh string:");
		String s= sc.nextLine();
		int len=s.length();
		
		int splChar=0,digits=0,lowerCase=0,upperCase=0;
		while(len-->0)
		{
			if(s.charAt(len)>=65 && s.charAt(len)<=90)
				upperCase++;
			else if(s.charAt(len)>=97 && s.charAt(len)<=122)
				lowerCase++;
			else if(s.charAt(len)>=48 && s.charAt(len)<58)
				digits++;
			else
				splChar++;
		}
		
		System.out.println("Splchar="+splChar+"\nDigits="+digits+"\nlowerCase="+lowerCase+"\nUpperCase="+upperCase);

	}

}
