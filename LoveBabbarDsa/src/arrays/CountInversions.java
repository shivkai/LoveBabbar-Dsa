package arrays;

public class CountInversions {
	private static void count(int[] arr,int len) {
		int ans=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(arr[i]>arr[j] && i<j)
				{
					ans++;
				}
			}
		}
		System.out.println(ans);

	}
	public static void main(String[] args) {
		int[] arr = {1, 20, 6, 4, 5};
		int len = arr.length;
		count(arr,len);

	}

}
