package mediumQuestions;

import java.util.Arrays;

public class _4Sum {
	public static void helper(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length-3;i++)
		{
			for(int j=i+1;j<arr.length-2;j++)
			{
				int s=j+1,e=arr.length-1;
				while(s<e)
				{
					if(arr[i]+arr[s]+arr[e]+arr[j]==0)
					{
						System.out.println(arr[i]+" "+arr[s]+" "+arr[e]+" "+arr[j]);
						s++;e--;
					}
					else if(arr[i]+arr[s]+arr[e]+arr[j]<0)
					{
						s++;
					}
					else {
						e--;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,0,-1,0,-2,2};
		helper(arr);

	}

}
