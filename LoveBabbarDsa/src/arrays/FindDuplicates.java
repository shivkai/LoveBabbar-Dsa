package arrays;

import java.util.HashMap;


public class FindDuplicates {
	private static void optimizedFind(int[] arr) {
		int n = arr.length;
		for(int i=0;i<arr.length;i++)
		{
			arr[arr[i]%n]=arr[arr[i]%n]+n;
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=n*2)
			{
				System.out.print(i+" ");
			}
		}

	}
	private static void find(int[] arr) {
		HashMap<Integer,Integer> mp = new HashMap<>();
		HashMap<Integer,Integer> ans = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]) && !ans.containsKey(arr[i]))
			{
				ans.put(arr[i], i);
			}
			mp.put(arr[i],i );
		}
System.out.println(ans.keySet());
	}
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4 ,3,2};
//		find(arr);
		optimizedFind(arr);
	}

}
