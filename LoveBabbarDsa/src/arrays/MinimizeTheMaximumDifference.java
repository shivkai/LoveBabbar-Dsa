package arrays;

import java.util.Arrays;

public class MinimizeTheMaximumDifference {
	private static int ans(int[] arr,int k,int n) {
		Arrays.sort(arr);
		int maxDiff = (arr[n-1]+k)-(arr[0]+k);
		int tempMax = arr[n-1]-k;
		int tempMin = arr[0]+k;
		int max,min;
		for(int i=0;i<n-1;i++)
		{
			max = Math.max(tempMax, arr[i]+k);
			min = Math.min(tempMin, arr[i+1]-k);
			maxDiff = Math.min(maxDiff, max-min);
		}
		return maxDiff;

	}
	public static void main(String[] args) {
		int arr[] = {1,5,10,15 };
		int n = arr.length;
		int k = 3;
		System.out.println(ans(arr,k,n));

	}

}
