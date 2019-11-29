import java.util.Scanner;
class prgm4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("fibbonaci: ");
		fib(n);
	}

	static void fib(int n)
	{
		if(n<1)
			System.out.println("Not a valid number");
		int a=1,b=1;
		System.out.print(a+" ");
		if(n>1)
			System.out.print(b+" ");
		while(n-->2)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
