package task2;

public class Student 
{
	private String name;		//Private
	public int rollNo;			//Public
	protected char grade;		//Protected
	int age;					//Package
	

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		Cse cs1= new Cse();
		cs1.display();
	}

}

class Cse extends Student	//Subclass, Same package
{
	Student s3 = new Student();
	
	protected void display()				
	{
		s3.rollNo=100;			
		System.out.println("\nPublic variable \"rollNo\" accessed from subclass, same package = "+ s3.rollNo);
		
		
		s3.grade='A';
		System.out.println("\nPublic variable \"grade\" accessed from subclass, same package = "+s3.grade);
		
		s3.age=18;
		System.out.println("\nPackage variable \"age\" accessed from subclass, same package = "+ s3.age);
	}
	
	
}
