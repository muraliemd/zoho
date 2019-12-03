package task2;
//What is the meaning of declaring a method "static" ? how do you invoke such a method ?


/*
 * Static methods are belongs to class rather than object.
 * So it runs without any instance of the class.
 * A static method is called using the class (className.methodName) 
 */

public class Prgm10 
{

	static int number=1;
	public static void main(String[] args) 
	{
		
		Prgm10.display();
		
		display();			//Above statement and this statement are the same one. 
		
		new Prgm10().print();
		
	}
	
	private static void display()		//Static method
	{
		System.out.println("static method is invoked");
	}
	
	
	/* For my understanding
	 * Non-static methods can access any static method and any static variable without creating an instance of the class.
	 */
	
	private void print()		//Non Static method
	{
		System.out.println("Non static method is invoked "+ Prgm10.number);		//Accessing static variable
		
		display();		//Accessing Static method
	}

}
