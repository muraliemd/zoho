package task3;
// Print current time & date

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prgm9 
{

	public static void main(String[] args) 
	{
		Date date= new Date();
		System.out.println(date);

		//2nd way
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss dd/MM/YYYY");
		System.out.println(df.format(date));

		//3rd way
		Calendar calobj = Calendar.getInstance();
		System.out.println(calobj.getTime());
		
		System.out.println(df.format(calobj.getTime()));
	}

}