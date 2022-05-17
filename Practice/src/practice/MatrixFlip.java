package practice;

public class MatrixFlip {
	
	public static void matrixFlip(int[][] input1)
	{
		int n = input1.length;
		int m = input1[0].length;
		int[][] arr = new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			int k=0;
			for(int j= m-1;j>=0;j--)
			{
				if(k<m)
				{
				arr[i][k]=input1[i][j]^1;
				k++;
				}
			}
		}

		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<m;j++)
			{
			System.out.print(arr[i][j]+" ");	
			}
			System.out.println();}
		
	}
	public static void main(String[] args) {
		int [][]arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		 matrixFlip(arr);
	}

}
