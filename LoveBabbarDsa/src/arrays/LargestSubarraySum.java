package arrays;

public class LargestSubarraySum {

	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int maxSoFar = Integer.MIN_VALUE;
		int s= 0,e=0;
		int maxV = 0;
		for(int i=0;i<arr.length;i++)
		{
			maxV+=arr[i];
			if(maxSoFar<maxV)
			{
				maxSoFar = maxV;
				
			}
			else if(maxV<0)
			{
				
				maxV=0;
			}
		}
		System.out.println(maxSoFar+" "+s+" "+e);

	}

}
