package task1;
import java.util.Scanner;
public class Prgm7 {


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		int l=-1;
		try
		{
			while(s.charAt(++l)!='\0');    //ArrayIndexOutofBound Exception
		}
		catch(Exception e)
		{
			System.out.println(l);
		}

	}

}
