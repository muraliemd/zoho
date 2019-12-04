package task1;

import task2.Student;

public class Specifier extends Student //Subclass, Different Package
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println("Public variable \"rollNo\" accessed from subclass, diff package = " + s1.rollNo);
		
		new Specifier().displayGrade('F');
		
		new Modifiers().displayRollNo();
	}
	
	private void displayGrade(char grade)
	{
		this.grade=grade;
		System.out.println("\nProtected variable \"grade\" accessed from subclass, diff package = " + this.grade);
	}
	
	
}

class Modifiers		//Non sub class, Different Package
{
	Student s1= new Student();
	protected void displayRollNo()
	{
		s1.rollNo=100;
		System.out.print("\nPublic variable \"rollNo\" accessed from non subclass, diff package = " + s1.rollNo);
		
	}
}