package kodnestSearchSort;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		KodnestSearchSort KSS=new KodnestSearchSort();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int len=scan.nextInt();
		int[]arr=new int[len];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for Searching");
		System.out.println("Enter 2 for Sorting");
		System.out.println("Enter 3 for find maximium or minimum element");
		int choice=scan.nextInt();
		switch(choice){
			case 1:
			System.out.println("Enter your choice");
			System.out.println("Enter 1 for linear searching");
			System.out.println("Enter 2 for binary searching");
			int choice1=scan.nextInt();
			if(choice1==1) {
				System.out.println("Enter key to search");
				int key=scan.nextInt();
				int res=KSS.linearSearch(arr,key);
				System.out.println("Key found at "+res);
			}
			else {
				System.out.println("Enter your choice to perform binary search by using which sorting technique");
				System.out.println("Enter 1 for BubbleSort");
				System.out.println("Enter 2 for Selectionsort");
				System.out.println("Enter 3 for Insertionsort");
				int choice2=scan.nextInt();
				System.out.println("Enter key to search");
				int key=scan.nextInt();
				if(choice2==1) {
					KSS.bubbleSortAscending(arr);
				    int res=KSS.binarySearch(arr, key);
				    if(res==-1)
					System.out.println("Element not found");
				    else
				    	System.out.println("Element found at index "+res);
				}
				else if(choice2==2)
				{
					KSS.selectionSortAscending(arr);
					int res1=KSS.binarySearch(arr, key);
					if(res1==-1)
						System.out.println("Element not found");
					else
					System.out.println("Key found at index "+res1);
					
				}
				else if(choice2==3)
				{
					KSS.insertionSortAscending(arr);
					int res2=KSS.binarySearch(arr, key);
					if(res2==-1)
						System.out.println("Element not found");
					 else
					System.out.println("Key found at index "+res2);
				
				}
				else
					System.out.println("Go to vasaan eye care");
				}
			     break;
		    case 2:
			System.out.println("Enter your choice");
			System.out.println("Enter 1 for Bubblesort");
			System.out.println("Enter 2 for Selectionsort");
			System.out.println("Enter 3 for Insertionsort");
			int choice3=scan.nextInt();
			if(choice3==1) {
				System.out.println("Enter 1 for ascending and 2 for descending");
				int choice4=scan.nextInt();
				if(choice4==1)
				{
					KSS.bubbleSortAscending(arr);
					System.out.println("Array elements after sorting");
					for(int i=0;i<=arr.length-1;i++) {
						System.out.print(arr[i]+" ");
					}
				}
				else
				{
					KSS.bubbleSortDescending(arr);
				}
			}
			else if(choice3==2) {
				System.out.println("Enter 1 for ascending and 2 for descending");
				int choice5=scan.nextInt();
				if(choice5==1)
				{
					KSS.selectionSortAscending(arr);
					System.out.println("Array elements after sorting");
					for(int i=0;i<=arr.length-1;i++) {
						System.out.print(arr[i]+" ");
					}
				}
				else
				{
					KSS.selectionSortDescending(arr);
				}}
			else if(choice3==3)
			{
				System.out.println("Enter 1 for ascending and 2 for descending");
				int choice6=scan.nextInt();
				if(choice6==1)
				{
					KSS.insertionSortAscending(arr);
					System.out.println("Array elements after sorting");
					for(int i=0;i<=arr.length-1;i++) {
						System.out.print(arr[i]+" ");
					}
				}
				else
				{
					KSS.insertionSortDescending(arr);
				}
			}
		else 
		{
				System.out.println("Go to vasaan eye care");
		}
			break;
		    case 3:
		    	System.out.println("Enter your choice 1 for finding maximum and 2 for finding minimum");
		    	int choice7=scan.nextInt();
		    	if(choice7==1)
		    	{
		    		int res=KSS.findMax(arr);
		    		System.out.println("The maximum element in the given array is "+res);
		    	}
		    	else if(choice7==2) {
		    		int res=KSS.findMinimum(arr);
		    		System.out.println("The minimum element in the given array is "+res);
		    		
		    	}
		    	else
		    	{
		    		System.out.println("Go to vasaan eye care");
		    	}
		    	break;
		    	default:
		    		System.out.println("GO TO VAASAN EYE CARE FOR EYE CHECKUP");
		    		
		}
	}
}
		    			