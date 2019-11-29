package task2;

public class Student 
{
	private String name;
	public int rollNo;
	protected char grade;
	int age;


	void setName(String name)
	{
		this.name=name;
	}

	String getName()
	{
		return name;
	}


}

class cse extends Student
{
	Student s3 = new Student();
	
	void display()
	{
		System.out.println("age"+ s3.age);
	}
}
