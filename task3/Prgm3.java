package task3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//eliminate numeric values in an string

public class Prgm3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		str=str.replaceAll("(\\d)", "");
		
		System.out.println("Str:"+str);
		
		//Another way, but both are same.
		//Matcher matcher = Pattern.compile("\\d").matcher(str);
		//str = matcher.replaceAll("");
		
	}

}
