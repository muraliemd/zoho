package task3;
/*Question:
 * What is the difference between "==" operator and "equals" method in String Operations.
 * "==" operator compares and returns numerical values. "equals" compares and returns  the  Boolean  value(true or false).
 */


/*
 * == operators for reference comparison (address comparison) and .equals() method for content comparison.
 * Both will return boolean value.
 */

public class Prgm11 
{

	public static void main(String[] args) 
	{
		String s1=new String("Zoho");
		String s2=new String("Zoho");
		
		System.out.println("== : "+ (s1==s2));
		System.out.println("equals : "+s1.equals(s2));
		
		s2=s1;
		System.out.println("== : "+ (s1==s2));
		System.out.println("equals : "+s1.equals(s2));
	}

}
