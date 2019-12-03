package task2;
// Is the method main belong to any class? , if not why? , if so what are the access privileges to that method?


public class Prgm5 
{
	public static void main(String[] args) 
	{
		/*Here main method belongs to Prgm5 class.
		 * We can't call main() without class.
		 * JVM will call the main method, It should be in public access specifier only.
		 */
		System.out.println("JVM invoked main() which is public and belongs to Prgm5");
	}

}
