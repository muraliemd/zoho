package task1;
import java.util.Scanner;
public class Prgm8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String Array:");
		int n=sc.nextInt();
		sc.nextLine();
		String str[]=new String[n];
		for (int i = 0; i < n; i++) 
		{
			System.out.println("Enter the String "+i+":");
			str[i]= sc.nextLine();
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(strcmp(str[i],str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		for(String s:str)
			System.out.println(s);
		
	}
	
	static int strcmp(String s1,String s2)
	{
		int n=Math.min(s1.length(), s2.length());
		for(int i=0;i<n;i++)
		{
			if(s1.charAt(i)<s2.charAt(i))
				return 0;
			else if(s1.charAt(i)>s2.charAt(i))
				return 1;
		}
		return 0;
	}

}
