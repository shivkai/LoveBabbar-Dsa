package maze;
import java.util.*;
public class UniquePathInMaze {
	
	private static void findPath(char[][] arr,int i,int j) {
		if(i<0 || j<0 || i>=arr.length || j>=arr[i].length || arr[i][j]=='X')
		{
			return;
		}
		else if(i==arr.length-1  && j==arr[i].length-1)
		{
			arr[i][j] = '1';
			printIt(arr);
			return;
		}
		arr[i][j] = '1';
		findPath(arr,i,j+1);
		findPath(arr,i+1,j);
		arr[i][j] = 'O';
		return;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		char[][] arr = new char[n][m];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.next().toCharArray();
		}
		sc.close();
		 findPath(arr,0,0);
		
	}
	private static void printIt(char[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
