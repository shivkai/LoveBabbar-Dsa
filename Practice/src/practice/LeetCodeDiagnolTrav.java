package practice;

public class LeetCodeDiagnolTrav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; 
		int m = arr.length,n=arr[0].length,r=0,c=0;
		boolean up = true;
		int[] ans = new int[m*n];
		while(r<m && c<n)
		{
			if(up)
			{
				System.out.print(arr[r][c]+" ");
				while(r-1>=0 && c+1<n)
				{
				System.out.print(arr[r-1][c+1]+" ");
				r--;c++;
				}
				if(c==n-1)
				{
					r++;
				}
				else {
					c++;
				}
			}
			else {
			System.out.print(arr[r][c]+" ");
			while(r+1<m && c-1>=0)
			{
				System.out.print(arr[r+1][c-1]+" ");
				r++;c--;
			}
			if(r==m-1)
			{
				c++;
			}
			else {
				r++;
			}
			}
			up=!up;
		}
	}

}
