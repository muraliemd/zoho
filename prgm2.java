class prgm2
{
	public static void main(String[] args)
	{
		int arr[]={10,-1,-10,2,100,54};
		
		int max= Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>max)
				max=i;
		}
		System.out.println("Max ="+max);
	}
}
