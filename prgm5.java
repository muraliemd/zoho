import java.util.Scanner;
class prgm5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("fact="+fact(n));
	}
	
	static int fact(int n)
	{
		if(n<1)
			return 0;
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
}
