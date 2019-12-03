package task1;
//sorting (Ascending order) given Array

import java.util.Scanner;
public class Prgm3
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
        		
        while(true)
        {	
        	System.out.println("Enter the sorting technique 1.Bubble sort 2.Merge Sort 3.Insertion Sort 4.Quick Sort");
        	int choice = sc.nextInt();
        	switch(choice)
        	{
        		case 1:
        			bubbleSort(arr);
        			break;
        		case 2:
        			mergeSort(arr,0,arr.length-1);
        			break;
        		case 3:
        			insertionSort(arr);
        			break;
        		case 4:
        			quickSort(arr, 0, arr.length-1);
        			break;
        		case 5:
        			System.out.println("Exiting..");
        			System.exit(0);
        			break;
        	}
        	System.out.print("Sorted Array:");
        	for(int i:arr)
        	{
        		System.out.print(i +" ");
        	}
        	System.out.println();

        }
        	
        	

        }
        
        private static void quickSort(int arr[],int lb,int ub)
        {
        	
        	if(lb < ub)
        	{
        		int loc=quick(arr,lb,ub);
        		quickSort(arr,lb,loc-1);
        		quickSort(arr,loc+1,ub);
        	}

        }
        
        private static int quick(int[] arr, int lb, int ub) 
        {
        	int pivot = arr[ub];   
            int i = lb-1; 	
          
            for (int j = lb; j <= ub - 1; j++)  
            {  
                if (arr[j] < pivot)        	// If current element is smaller than the pivot  
                {  
                    i++; 		// increment index of smaller element  
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }  
            
            //Finally,Place the pivot in right position.
            int temp=arr[i+1];
            arr[i+1]=arr[ub];
            arr[ub]=temp;
            return (i + 1);  
		}

		private static void insertionSort(int[] arr) 
        {
			for(int i=1;i<arr.length;i++)
			{
				int key=arr[i],j=i-1;
				while(j>=0 && key<arr[j])
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[++j]=key;
			}
				
			
		}

		private static void bubbleSort(int[] arr)
        {
        	for(int i=0;i<arr.length-1;i++)
        	{
        		for(int j=i+1;j<arr.length;j++)
        		{
        			if(arr[i]>arr[j])
        			{
        				arr[i]=arr[i]+arr[j];
        				arr[j]=arr[i]-arr[j];
        				arr[i]=arr[i]-arr[j];
        			}
        		}
        	}
        }
        
        
        private static void mergeSort(int[] arr,int lb,int ub)
        {
        	int mid=(lb+ub)/2;
        	if(lb<ub)
        	{
        		mergeSort(arr,lb,mid);
        		mergeSort(arr,mid+1,ub);
        		merge(arr,lb,mid,ub);
        	}
        }

		private static void merge(int[] arr, int lb, int mid, int ub) 
		{
			int[] temp = new int[ub+1];
			
			int i=lb,j=mid+1,tempIndex=lb;
			
			while(i<=mid && j<=ub)
			{
				if(arr[i]<=arr[j])
				{
					temp[tempIndex++]=arr[i++];
				}
				else
				{
					temp[tempIndex++]=arr[j++];
				}
			}
			
			if(i>mid)          //element not present in ith index array and element present in jth index array
			{
				while(j<=ub)
				{
					temp[tempIndex++]=arr[j++];
				}
			}
			
			if(j>mid)	 //element present in ith index array and not in jth index array
			{
				while(i<=mid)
				{
					temp[tempIndex++]=arr[i++];
				}
			} 	  
			
			for(i=lb;i<=ub;i++)  //Copying the temp array to original array after sorting
			{
				arr[i]=temp[i];
			}
		}
}
