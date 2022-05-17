package arrays;

public class BestTimeToBuyAndSellStocks {
	private static void maxProfit(int[] arr,int n) {
		int min = Integer.MAX_VALUE;
		int  msf = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]-min>msf)
			{
				msf = arr[i]-min;
			}
			
		}
		System.out.println(msf);

	}
	public static void main(String[] args) {
		int price[] = {7, 6, 4, 3, 1};
		int n = price.length;
		maxProfit(price,n);

	}

}
