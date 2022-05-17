package arrays;
public class CountingSort {
	public static void sort(int[] arr,int max,int min)
	{
		int size = max-min+1;
		int freq[] = new int[size];
		for(int a:arr)
		{
			freq[a-min]++;
		}
		
		for(int i=1;i<=freq.length-1;i++)
		{
			freq[i] +=freq[i-1];
		}
		int ans[] = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			ans[freq[arr[i]-min]-1] = arr[i];
			freq[arr[i]-min]--;
		}
		for(int a:ans)
		{
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i:arr)
		{
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		sort(arr,max,min);

	}

}
