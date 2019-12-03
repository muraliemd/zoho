package task2;

/*
 * Learning about access specifiers (Write java programs to bring about the difference between public,private,package and protected specifiers!)
 *    What is the meaning of declaring a class public? 
 * (try this by putting the class in a package and try to access the class from a different package!).
 */

public class Prgm3   //Non subclass, Same package
{
	
	public static void main(String[] args) 
	{
		Student s1=new Student();
		
		s1.rollNo=23;
		System.out.println("Public variable \"rollNo\" accessed from non subclass, same package = " + s1.rollNo);
		
		
		//If we try to access the private variable, It will give error         s1.number=1;
		s1.setName("Zoho");		//We are accessing "name" variable through methods. Encapsulation achieved.
		
		System.out.println("\nPrivate variable \"Name\"  through get method = "+s1.getName());
		
		s1.age=12;  
		System.out.println("\nPackage variable \"age\" accessed from non subclass, same package = " + s1.age);
		
		s1.grade='a'; 
		System.out.println("\nProtected variable \"grade\" accessed from non subclass, same package = " + s1.grade);
	}

}




