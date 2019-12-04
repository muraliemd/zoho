package task3;
//Check an input time greater or less than current time  ( need to handle with  date)

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Prgm10 
{

	public static void main(String[] args)
	{
		Date currentDate = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date and time in \"HH:MM:SS\" : ");
		String str=sc.nextLine();
		try 
		{
			Date inputDate = new SimpleDateFormat("HH:mm:ss").parse(str);

			if(inputDate.before(currentDate))
			{
				System.out.println(inputDate+ " is less than current time");
			}
			else if(inputDate.after(currentDate))
			{
				System.out.println(inputDate+ " is greater than current time");
			}
			else
			{
				System.out.println(inputDate+" are equal");
			}
		}
		catch(ParseException E)
		{
			System.out.println(E.getMessage()+"\nPlease enter date and time in the correct format");
		}
	}
 
}
