package maze;
import java.util.*;
public class KnightsMove {
	private static void printIt(int[][] sol) {
		for(int i=0;i<sol.length;i++)
		{
			for(int j=0;j<sol[0].length;j++)
			{
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		

	}
	private static void knightTour(int n,int r,int c,int move,int[][] sol) {
		if(r<0 || c<0 || r>=sol.length || c>=sol.length || sol[r][c]!=-1)
		{
			return;
		}
		else if(move==n*n)
		{
			sol[r][c] = move;
			printIt(sol);
//			sol[r][c] = -1;
			return;
		}
		sol[r][c] = move;
		knightTour(n,r-2,c+1,move+1,sol);
		knightTour(n,r-1,c+2,move+1,sol);
		knightTour(n,r+1,c+2,move+1,sol);
		knightTour(n,r+2,c+1,move+1,sol);
		knightTour(n,r+2,c-1,move+1,sol);
		knightTour(n,r+1,c-2,move+1,sol);
		knightTour(n,r-1,c-2,move+1,sol);
		knightTour(n,r-2,c-1,move+1,sol);
		sol[r][c] = -1;

	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int r = sc.nextInt();
	int c = sc.nextInt();
	sc.close();
	int sol[][] = new int[n][n];
	for(int i=0;i<sol.length;i++)
	{
		Arrays.fill(sol[i], -1);
	}
	knightTour(n,r,c,1,sol);

}
}
