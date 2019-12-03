package task1;
import java.util.Scanner;
//sorting String array

public class Prgm8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String Array:");
		int size=sc.nextInt();
		sc.nextLine();
		
		String str[]=new String[size];
		for (int i = 0; i < size; i++)    //Get the input Strings from user.
		{
			System.out.println("Enter the String "+i+":");
			str[i]= sc.nextLine();
			str[i]=str[i].toLowerCase();
		}
		
		
		for(int i=0;i<size-1;i++)   //Compare each strings and sort it in ascending order
		{
			for(int j=i+1;j<size;j++)
			{
				if(strcmp(str[i],str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		System.out.println("\nSorted Array:");
		for(String s:str)
		{
			System.out.println(s);
		}
		
	}
	
	private static int strcmp(String str1,String str2)
	{
		int minStringLength=Math.min(str1.length(), str2.length());
		
		for(int i=0;i<minStringLength;i++)
		{
			if(str1.charAt(i)<str2.charAt(i))
			{	
				return 0;
			}
			else if(str1.charAt(i)>str2.charAt(i))
			{	
				return 1;
			}
		}
		
		if(str1.length()>str2.length())
			return 1;
		
		return 0;
	}

}
