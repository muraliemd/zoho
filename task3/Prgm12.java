package task3;
//What is the difference between "Life & scope of the variables". Explain with sample program.

public class Prgm12 
{
	/*Static variable
	 *Scope of an static variable is throughout the class. 
	 *Lifetime of an static variable is until the end of the program.
	 */
	static String collegeName="GCE";
	
	
	/*Instance variable
	 *Scope of an instance variable is throughout the class except in static methods. 
	 *Lifetime of an instance variable is until the object stays in memory.
	 */
	String stduentName; 

	
	public static void main(String[] args) 
	{
		Prgm12 obj1=new Prgm12();
		
		obj1.printStudentName();
		obj1.display();
		
		System.out.println("Static Variable College Name : "+Prgm12.collegeName);
	}
	
	private void display()
	{
		/*Local variable
		 *Scope of an Local variable is only within that block. 
		 *Lifetime of an Local variable is until the block completes it's execution.
		 */
		int age=18;
		System.out.println("Local Variable Age : "+age);
		
		System.out.println("Static Variable College Name : "+Prgm12.collegeName);
	}
	
	private void printStudentName()
	{
		stduentName="Murali";
		
		System.out.println("Instance Variable Student Name : "+stduentName);
	}
}
