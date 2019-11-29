class prgm3
{
        public static void main(String[] args)
        {
                int a[]={10,-1,-10,2,100,54,10};

                for(int i=0;i<a.length-1;i++)
                {
                        for(int j=i+1;j<a.length;j++)
                        {
                                if(a[i]>a[j])
                                {
                                        int temp=a[i];
                                        a[i]=a[j];
                                        a[j]=temp;
                                }
                        }
                }
		System.out.println("Sorted Array:");
                for(int i:a)
                        System.out.print(i +" ");
		System.out.println();

        }
}
