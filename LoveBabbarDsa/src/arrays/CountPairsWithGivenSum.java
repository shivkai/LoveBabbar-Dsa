package arrays;

public class CountPairsWithGivenSum {
	private static void twoSum(int[] arr,int t) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==t)
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}
	private static void twoSum2(int[] arr,int t) {
		int count= 0;
		for(int i=0;i<arr.length;i++)
		{
			int tt = t-arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==tt)
				{
					count++;
				
				}
			}
		}
		System.out.println(count);

	}
	public static void main(String[] args) {
		int arr[] = {1, 5, 7, -1, 5};
		int target = 6;
		twoSum(arr,target);
		twoSum2(arr,target);
	}

}
