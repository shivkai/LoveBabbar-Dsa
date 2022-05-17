package arrays;
import java.util.*;
public class SortingMethods {
	// SWAPPING METHOD
	public static void swap(int i , int j, int[] arr)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
//		arr[i] = arr[i]+arr[j];
//		arr[j] = arr[i]-arr[j];
//		arr[i] = arr[i]-arr[j];
	}
	
	
// ---------------------------------------------------------------------------------	
	
	// QUICKSORT
//	worst : O(n^2)
//	best and avg : O(n.logn)
	public static void quickSort(int[] arr, int s,int e) {
		if(s<e)
		{
			int mid = s+ (e-s)/2;
			
			int pivot = findPivot(arr,s,e);
			quickSort(arr,s,pivot-1);
			quickSort(arr,pivot+1,e);
		}
		
	}
	
	private static int findPivot(int[] arr,int s, int e) {
		int pivot = arr[e];
		int i = s-1;
		
		for(int j = s;j<e;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				
				swap(i,j,arr);
			}
		}
		swap(i+1,e,arr);
		return i+1;
	}
	
// ---------------------------------------------------------------------------------	
	// MERGE SORT  
//	avg , best , worst case = O(n.logn)

	public static void merge(int[] arr , int s , int mid, int e)
	{
		
		int l1 = mid-s+1;
		int l2 = e-mid;
		
		int l[] = new int[l1];
		int r[] = new int[l2];
		
		for(int i=0;i<l1;i++)
		{
			l[i] = arr[s+i];
		}
		for(int i=0;i<l2;i++)
		{
			r[i] = arr[mid+1+i];
		}
		
		int i=0,j=0;
		int k=s;
		while(i<l1 && j<l2)
		{
			if(l[i]<=r[j])
			{
				arr[k] = l[i];
				i++;
			}else {
				arr[k] = r[j];
				j++;
			}
			k++;
		}
		
		while(i<l1)
		{
			arr[k] = l[i];
			i++;
			k++;
		}
		while(j<l2)
		{
			arr[k] = r[j];
			j++;
			k++;
		}
	}
		
	public static void mergeSort(int[] arr ,int s, int e)
	{		
		if(s<e) {
			
		int mid = (s+e)/2;
		
		mergeSort(arr,s,mid);
		mergeSort(arr,mid+1,e);
		merge(arr,s,mid,e);
		}
	}
	
// ---------------------------------------------------------------------------------	
	
	// BUUBLE SORT
//		worst case : O(n^2)
//		avg case : O(n)  (optimized)
	public static void bubbleSort(int[] arr,int n)
	{
		
		boolean swapped;
		
		for(int i=0;i<n-1;i++)
		{
			swapped = false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(j,j+1,arr);
					swapped = true;
				}
			}
			if(swapped== false) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
//		bubbleSort(arr,n);
//		mergeSort(arr,0,n-1);
		quickSort(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
		sc.close();
		

	}

}
//1st case :  Input  : arr[] = {1, 2, 3}
//			Output : arr[] = {3, 2, 1}

//2nd case :  Input :  arr[] = {4, 5, 1, 2}
//			Output : arr[] = {2, 1, 5, 4}