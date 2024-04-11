package kodnestSearchSort;

public class KodnestSearchSort 
	{

		int linearSearch(int arr[],int key)

		{
		
			for(int i=0;i<=arr.length-1;i++) 
			{
				if(arr[i]==key) 
				{
				return i;	
				}
			
			}
			return -1;
			
	

		}

		int binarySearch(int arr[],int key)

		{
			
			
			int low=0;
			int high=arr.length-1;
			while(low<=high) {
				int mid=(low+high)/2;
				if(key==arr[mid]) {
					//System.out.println("key found at "+ mid);
					return mid;
					
				}
				else if(key>arr[mid]) {
					low=mid+1;
					
				}
				else {
					high=mid-1;
				}
			
				
			}
		
			return -1;

		

		}
		void bubbleSortAscending(int arr[])

		{
			for(int i=0;i<=arr.length-2;i++) {
				for(int j=0;j<=arr.length-2-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
			

		}

		void bubbleSortDescending(int arr[])

		{
			for(int i=0;i<=arr.length-2;i++) {
				for(int j=0;j<=arr.length-2-i;j++) {
					if(arr[j]<arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Array elements after sorting are:");
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}

		}

		void selectionSortAscending(int arr[])

		{
			for(int i=0;i<=arr.length-2;i++) {
				int min=arr[i];
				int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
			}
			

		}

		void selectionSortDescending(int arr[])

		{
			System.out.println("Array elements after sorting");
			for(int i=0;i<=arr.length-2;i++) {
				int min=arr[i];
				int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]>min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
			}
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}
		}

		void insertionSortAscending(int arr[])

		{
			//System.out.println("Array elements after sorting");
			for(int i=1;i<=arr.length-1;i++) {
				int item=arr[i];
				int j=i-1;
				while(j>=0&&arr[j]>item) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=item;
			}
			

		}

		void insertionSortDescending(int arr[])

		{
			System.out.println("Array elements after sorting");
			for(int i=1;i<=arr.length-1;i++) {
				int item=arr[i];
				int j=i-1;
				while(j>=0&&arr[j]<item) {
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=item;
			}
			
			for(int i=0;i<=arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}

		}

		int findMinimum(int arr[])

		{
			for(int i=0;i<=arr.length-2;i++) {
				for(int j=0;j<=arr.length-2-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			

		return arr[0];

		}

		int findMax(int arr[])

		{
			for(int i=0;i<=arr.length-2;i++) {
				for(int j=0;j<=arr.length-2-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}

		return arr[arr.length-1];

		}

		
		
	}


