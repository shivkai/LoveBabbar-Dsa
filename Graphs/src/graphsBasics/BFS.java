package graphsBasics;
import java.util.*;
public class BFS {
	public static void Bfs(int root,Map<Integer,List<Integer>> adj)  {
		Set<Integer> vis = new HashSet<>();
		Queue<Integer> qq = new LinkedList<>();
		qq.add(root);
		vis.add(root);
		while(!qq.isEmpty())
		{
			int val = qq.poll();
			System.out.print(val+" ");
			List<Integer> neighbour = adj.getOrDefault(val,new ArrayList<>());
			for(int elem : neighbour)
			{
				if(!vis.contains(elem)) {

					vis.add(elem);
					qq.add(elem);
				}
			}
			

		}
	}
	public static void main(String[] args) {
		CreateGraph g = new CreateGraph(7);
		g.addEdge(1, 2, true);
		g.addEdge(1, 3, true);
		g.addEdge(2, 4, true);
		g.addEdge(3, 4, true);
		g.addEdge(3, 5, true);
		g.addEdge(5, 6, true);
		g.addEdge(6, 7, false);
		g.display();
		Bfs(1,g.adj);
	}
}
