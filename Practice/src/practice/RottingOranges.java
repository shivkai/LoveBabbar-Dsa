package practice;
import java.util.*;
public class RottingOranges {
	
	public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer,Integer>> q = new LinkedList<Pair<Integer,Integer>>();
        int n =grid.length;
        int m = grid[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new Pair<>(i,j));
                   
                }
            }
        }
        int count=0;
        q.add(new Pair<>(-1,-1));
       
        while(!q.isEmpty())
        {
        	
            int a = q.peek().getKey();
            int b = q.peek().getValue();
           
            if(a==-1 && b==-1 && q.size()==1)
            {
                q.poll();
                break;
            }
            else if(a==-1 && b==-1 && q.size()>1)
            {
                count++;
                q.poll();
                q.add(new Pair<>(-1,-1));
            }
            else{
                if((a-1)>=0 && grid[a-1][b] == 1)
                {
                    grid[a-1][b] = 2;
                    q.add(new Pair<>(a-1,b));
                }
                if((b-1)>=0 && grid[a][b-1] == 1)
                {
                    grid[a][b-1] = 2;
                    q.add(new Pair<>(a,b-1));
                }
                if((a+1)<n && grid[a+1][b] == 1)
                {
                    grid[a+1][b] = 2;
                    q.add(new Pair<>(a+1,b));
                }
                if((b+1)<m && grid[a][b+1] == 1)
                {
                    grid[a][b+1] = 2;
                    q.add(new Pair<>(a,b+1));
                }
                q.poll();
            }
        }
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    return -1;
                }
            }
        }
       
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]  grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
		RottingOranges ro = new RottingOranges();
		System.out.println(ro.orangesRotting(grid));
	}

}
