package task2;
// List down the differences between String and StringBuffer class .

/*
 * String class is immutable,slow in concatenation and wasting memory. Stored in String constant pool
 * String Buffer class is mutable, fast in append and less memory because it will extend the size. Stored in heap memory.
 */

public class Prgm4 
{

	public static void main(String[] args) 
	{
		String strVariable=new String("Zoho");
		strVariable.concat("Tenkasi");
		
		StringBuffer strBufferVariable= new StringBuffer("Zoho");
		strBufferVariable.append("Tenkasi");
		
		System.out.println("After concat String = "+strVariable);
		System.out.println("After append StringBuffer = "+strBufferVariable);
	}

}
