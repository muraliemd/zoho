package task2;

/*
 * Learning about access specifiers (Write java programs to bring about the difference between public,private,package and protected specifiers!)
 *    What is the meaning of declaring a class public? 
 * (try this by putting the class in a package and try to access the class from a different package!).
 */

public class prgm3 
{
	
	public static void main(String[] args) 
	{
		Student s1=new Student();
		
		s1.rollNo=100;    //Accessing public variable from other class
		
		//If we try to access the private variable, It will give error         s1.number=1;
		s1.setName("Zoho");
		
		s1.age=12;   //Accessing default variable from outside the class but from same package
		
		s1.grade='a';   //Accessing protected variable from outside the class
	}

}




