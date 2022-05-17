package practice;

public class Spiralmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; 
		int m = arr.length,n = arr[0].length;
		int sr=0,sc=0,i=0;
		
		while(sr<m && sc <n)
		{
			for(i=sc;i<n;i++)
			{
				System.out.print(arr[sr][i]+" ");
			}
			sr++;
			for(i=sr;i<m;i++)
			{
				System.out.print(arr[i][n-1]+" ");
			}
			n--;
			
			if(sr<m)
			{
				for(i=n-1;i>=sc;i--)
				{
					System.out.print(arr[m-1][i]+" ");
				}
				m--;
			}
			if(sc<n)
			{
				for(i=m-1;i>=sr;i--)
				{
					System.out.print(arr[i][sc]+" ");
				}
				sc++;
			}
		}
		
		
	}

}
