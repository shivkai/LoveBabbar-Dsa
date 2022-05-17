package graphsBasics;
import java.util.*;
public class Dfs {
	private static void dfs(int src,Map<Integer,List<Integer>> nei,Set<Integer> st) {
//		Set<Integer> st = new HashSet<>();
		st.add(src);
		
		List<Integer> ll = nei.getOrDefault(src,new ArrayList<>());
		for(int n : ll)
		{
			if(!st.contains(n))
			{
				dfs(n,nei,st);
			}
		}
	}
	
	private static void bFSConn(int src, Set<Integer> vis,Map<Integer,List<Integer>> adj) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		vis.add(src);

		while (!q.isEmpty()) {
			int front = q.poll();
			System.out.print(front + " ");

			List<Integer> neighbourList = adj.getOrDefault(front, new ArrayList<>());

			for (int neighbour : neighbourList) {
				if (!vis.contains(neighbour)) {
					q.add(neighbour);
					vis.add(neighbour);
				}
			}
		}
	}
	public static void connectedComponenets(int V,Map<Integer,List<Integer>> mp) {
		// TODO Auto-generated method stub

		Set<Integer> vis = new HashSet<>();
		int count = 1;
		for(int v = 1; v <= V; v++) {
			
			if(!vis.contains(v)) {
				
				System.out.print("CC " + count + " -> ");
				
				bFSConn(v, vis,mp);
				count++;
				System.out.println();
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
//		g.addEdge(6, , false);
		g.display();
		Set<Integer> st = new HashSet<>();
//		dfs(2,g.adj,st);
		connectedComponenets(7,g.adj);
		System.out.println(st);
		System.out.println(g.indegree());
		
	}

}
