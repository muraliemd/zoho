package task2;

import java.nio.file.Paths;

//Write a java program to print the system properties (Hint : Refer to System class) Try to print the current working directory from you java program. 


/*
 * nio package is new IO package in java used esp. for file handling.
 * Path is an interface and Paths is a class. .get will retrieve the path of the given file. 
 */
public class Prgm9 
{	
	
	public static void main(String[] args) 
	{
		System.out.println("Current directory :"+ System.getProperty("user.dir") +"\n");
		
		System.out.println(Paths.get("").toAbsolutePath().toString());	
		
		System.out.println(System.getProperty("java.library.path")+"\n");
		
	}

}
