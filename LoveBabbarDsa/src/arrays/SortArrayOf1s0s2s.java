package arrays;

import java.util.Arrays;

public class SortArrayOf1s0s2s {
	public static void swap(int[] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	public static void sort(int []arr)
	{
		int s= 0 ,end = arr.length-1,k=0;
		while(k<=end)
		{
			if(arr[k]==0)
			{
				swap(arr,s,k);
				s++;
				k++;
			}
			else if(arr[k]==2)
			{
				swap(arr,k,end);
				end--;
			}
			else {
				k++;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
