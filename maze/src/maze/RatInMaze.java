package maze;

public class RatInMaze {
	private static void printIt(int[][] maze) {
		for(int i=0;i<maze.length;i++)
		{
			for(int j=0;j<maze[0].length;j++)
			{
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
		return;

	}
	private static void path(int r,int c,int len,int[][] maze) {
		
		if(r<0 || c<0 || r>=len || c>=len ||maze[r][c]==1)
		{
			return;
		}else if(r==len-1 && c == len-1 && maze[r][c]==1)
		{
			
				maze[r][c]=1;
			printIt(maze);
			return;
		}
		
		maze[r][c]=1;
		path(r+1,c,len,maze);
		path(r,c+1,len,maze);
		path(r-1,c,len,maze);
		path(r,c-1,len,maze);
		maze[r][c] = 0;
	}
	public static void main(String[] args) {
	int[][] maze = 
	{{1, 0, 0, 0},
	{1, 1, 0, 0},
	{0, 1, 0, 0},
	{0, 1, 1, 1}};
	int len = 4;
	path(0,0,len,maze);
	}

}
