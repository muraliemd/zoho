package task2;

/*
 * Write a class and override "toString" method in the class object.(When you write a class "A" does it have any parent? , investigate!).
 */


/*
 * Every class in java is child of Object class. Therefore the class Prgm7 has parent class as object.
 */

public class Prgm7 
{
	String name;
	int balance;
	
	Prgm7(String name,int balance)
	{
		this.name=name;
		this.balance=balance;
	}
	
	public static void main(String[] args) 
	{
		Prgm7 obj1 = new Prgm7("Murali",1000);
		System.out.println(obj1.toString());
	}
	
	@Override
	public String toString() 
	{
		return "Name = "+this.name + "\nBalance = "+this.balance;
	}

}
