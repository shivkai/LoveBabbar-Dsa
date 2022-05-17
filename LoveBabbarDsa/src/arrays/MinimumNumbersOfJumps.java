package arrays;

import java.util.ArrayDeque;

class Pair{
	int i;
	int step;
	int j;
	String psf;
	Pair(int i,int step,int j,String psf)
	{
		this.i = i;
		this.j = j;
		this.step = step;
		this.psf = psf;
	}
}
public class MinimumNumbersOfJumps {

	private static int func(int[] arr,int n) {
	 Integer dp[] = new Integer[n];
		dp[n-1] = 0;
		for(int i=n-2;i>=0;i--)
		{
			int steps = arr[i];
			int min = Integer.MAX_VALUE;
			for(int j=1;j<=steps && i+j<arr.length;j++) {
				if(dp[i+j]!=null && dp[i+j]<min)
				{
					min = dp[i+j];
				}
			}
			if(min!=Integer.MAX_VALUE)
			{
				dp[i] = min+1;
			}
		}
		
		ArrayDeque<Pair> que = new ArrayDeque<>();
		que.add(new Pair( 0,arr[0],dp[0],0+""));
		while(!que.isEmpty())
		{
			Pair rem = que.removeFirst();
			if(rem.j==0)
			{
				System.out.println(rem.psf);
			}
			for(int j=1;j<=rem.step && rem.i+j<arr.length;j++)
			{
				int ci = rem.i+j;
				if(dp[ci]!=null && dp[ci]== rem.j-1)
				{
					que.add(new Pair(ci,arr[ci],dp[ci],rem.psf+"->"+arr[ci]));
				}
			}
		}
		return 0;

	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n = arr.length;
		System.out.println(func(arr,n));
	}

}
