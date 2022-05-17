package maze;

import java.util.Arrays;

public class KnightPrac {
	private static void printIt(int[][] sol) {
		for(int i = 0;i<sol.length;i++)
		{
			for(int j=0;j<sol[0].length;j++)
			{
				System.out.print(sol[i][j]+" ");
				 
			}
			System.out.println();
		}

	}
	private static void KnightTour(int r,int c,int move,int len,int[][] sol) {
		if(r<0 || c<0 || r>=len || c>=len || sol[r][c]!=-1)
		{
			return;
		}
		else if(move == len*len)
		{
			sol[r][c] = move;
			printIt(sol);
			return;
		}
		
		sol[r][c] = move;
		KnightTour(r-2,c+1,move+1,len,sol);
		KnightTour(r-1,c+2,move+1,len,sol);
		KnightTour(r+1,c+2,move+1,len,sol);
		KnightTour(r+2,c+1,move+1,len,sol);
		KnightTour(r+2,c-1,move+1,len,sol);
		KnightTour(r+1,c-2,move+1,len,sol);
		KnightTour(r-1,c-2,move+1,len,sol);
		KnightTour(r-2,c-1,move+1,len,sol);
		
		sol[r][c] = -1;

	}
	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
		int n = 5;
		int sol[][] = new int[n][n];
		for(int i=0;i<sol.length;i++)
		{
			Arrays.fill(sol[i], -1);
		}
		KnightTour(0,0,1,n,sol);
	}

}
