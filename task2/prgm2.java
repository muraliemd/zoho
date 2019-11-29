package task2;

//In java are the parameters passed by reference or by value (Write a program to test for basic data types , arrays ,strings ,string arrays and custom objects !) 


/*Understanding
 * 
 * Data types and Strings are passed by value
 * whereas arrays, String Arrays and custom obj passed by reference
 */



class Animal
{
	String name;
	
	Animal(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}
	
	
}

public class prgm2 
{

	public static void main(String[] args) 
	{
		System.out.println("Data type int");
		int int1=10,int2=20;
		System.out.println("Before call A="+int1+" B="+int2);
		intSwap(int1,int2);
		System.out.println("After call A="+int1+" B="+int2);
		
		System.out.println("\nInteger");
		Integer i1=10,i2=20;
		System.out.println("Before call A="+i1+" B="+i2);
		integerSwap(i1,i2);
		System.out.println("After call A="+i1+" B="+i2);
		
		System.out.println("\nData type char");
		char ch1='a',ch2='z';
		System.out.println("Before call ch1="+ch1+" ch2="+ch2);
		charSwap(ch1,ch2);
		System.out.println("After call ch1="+ch1+" ch2="+ch2);
		
		System.out.println("\nData type Float");
		float f1=1.1f,f2=2.2f;
		System.out.println("Before call f1="+f1+" f2="+f2);
		floatSwap(f1,f2);
		System.out.println("After call f1="+f1+" f2="+f2);
	
		System.out.println("\nData type Double");
		Double d1=1.0,d2=2.0;
		System.out.println("Before call d1="+d1+" d2="+d2);
		doubleSwap(d1,d2);
		System.out.println("After call d1="+d1+" d2="+d2);
		
		System.out.println("\nData type boolean");
		boolean b1=true,b2=true;
		System.out.println("Before call b1="+b1+" b2="+b2);
		boolSwap(b1,b2);
		System.out.println("After call b1="+b1+" b2="+b2);
		
		System.out.println("\nStrings");
		String s1="Zoho",s2="Tenkasi";
		System.out.println("Before call s1="+s1+" s2="+s2);
		strSwap(s1,s2);
		System.out.println("After call s1="+s1+" s2="+s2);
		
		System.out.println("\nArrays");
		int arr[]={1,2,3,4,5};
		System.out.print("Before call : ");
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println("");
		arrSwap(arr);
		System.out.print("After call : ");
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println("");
		
		
		System.out.println("\nString arrays");
		String str[]={"Tenkasi","Zoho"};
		System.out.print("Before call : ");
		for(String s : str)
			System.out.print(s+" ");
		System.out.println("");
		strArraySwap(str);
		System.out.print("After call : ");
		for(String s : str)
			System.out.print(s+" ");
		System.out.println("");
	
		
		System.out.println("\nCustom Object");
		Animal obj1=new Animal("Lion");
		Animal obj2=new Animal("Tiger");
		System.out.println("Before call obj1="+obj1.getName()+" obj2="+obj2.getName());
		objSwap(obj1,obj2);
		System.out.println("After call obj1="+obj1.getName()+" obj2="+obj2.getName());
		
	}
	

	static void intSwap(int int1,int int2)
	{
		int temp=int1;
		int1=int2;
		int2=temp;
		System.out.println("In the fucntion int1="+int1+" int2="+int2);
	}
	
	static void integerSwap(Integer int1,Integer int2)
	{
		Integer temp=int1;
		int1=int2;
		int2=temp;
		System.out.println("In the fucntion i1="+int1+" i2="+int2);
	}
	
	static void charSwap(char ch1,char ch2)
	{
		char temp=ch1;
		ch1=ch2;
		ch2=temp;
		System.out.println("In the fucntion ch1="+ch1+" ch2="+ch2);
	}

	static void floatSwap(float f1,float f2)
	{
		float temp=f1;
		f1=f2;
		f2=temp;
		System.out.println("In the fucntion f1="+f1+" f2="+f2);
	}
	

	static void doubleSwap(double d1,double d2)
	{
		double temp=d1;
		d1=d2;
		d2=temp;
		System.out.println("In the fucntion d1="+d1+" d2="+d2);
	}
	
	static void boolSwap(boolean b1,boolean b2)
	{
		b1=false;
		b2=false;
		System.out.println("In the function b1="+b1+" b2="+b2);
	}

	static void strSwap(String st1,String st2)
	{
		String temp=st1;
		st1=st2;
		st2=temp;
		System.out.println("In the fucntion s1="+st1+" s2="+st2);
	}
	
	static void arrSwap(int temp[])
	{
		for(int i=0;i<temp.length;i++)
			temp[i]=0;
		System.out.print("In the function : ");
		for(int i : temp)
			System.out.print(i+" ");
		System.out.println("");
	}
	
	
	static void strArraySwap(String s[])
	{
		s[0]="Zoho";
		s[1]="Tenkasi";

		System.out.print("In the function : ");
		for(String i : s)
			System.out.print(i+" ");
		System.out.println("");
	}
	
	static void objSwap(Animal ob1, Animal ob2) 
	{
		ob1.name="Donkey";
		ob2.name="Monkey";
		System.out.println("In the function obj1="+ob1.getName()+" obj2="+ob2.getName());
	}
}
