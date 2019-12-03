package task2;

//Is it possible to have a private constructor? (write a class and try it out! ) , if possible how do you create an instance of it from another class?


/* Yes, We can create private constructor and access it using static factory method */

public class Prgm6 
{	
	public static void main(String[] args) 
	{
		Sample obj1 = Sample.createObject("Zoho");
		
		System.out.println(obj1.name);
	}
	
	
}

class Sample
{
	String name;
	
	private Sample(String name)
	{
		this.name=name;
	}
	
	public static Sample createObject(String name)
	{
		return new Sample(name);
	}
	
}
