package task1;
import java.util.Scanner;
//Find Biggest number in given array


public class Prgm2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the "+ (i+1)+" element");
			arr[i]=sc.nextInt();
		}
		
		int currentMax= arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>currentMax)
			{
				currentMax=arr[i];
			}
		}
		
		System.out.println("Biggest Number in the give array is "+currentMax);
	}
}
