package graphsBasics;
import java.util.*;
public class CreateGraph{
	 int V;
	 int c;
	 Map<Integer,List<Integer>> adj;
	
	public CreateGraph(int val)
	{
		V = val;
		this.adj = new HashMap<>();
	}
	public int[] indegree() {
		// TODO Auto-generated method stub
		int[] indegree = new int[V];
		for (int v = 0; v < V; v++) {
			List<Integer> neighbours = adj.getOrDefault(v, new ArrayList<>());
			for (int neighbour : neighbours) {
				indegree[neighbour]++;
			}
		}

		return indegree;
	}
	public void addEdge(int u,int v,boolean bi) {
		
		if(c<this.V) {
			List<Integer> nU = adj.getOrDefault(u, new ArrayList<>());
		nU.add(v);
		adj.put(u, nU);
		
		if(bi  == true)
		{
			List<Integer> nV  = adj.getOrDefault(v, new ArrayList<>());
			nV.add(u);
			adj.put(v, nV);
		}
		c++;
		}
	}

	public void display() {
		
		for(int val : adj.keySet())
		{
			Collections.sort(adj.get(val));
			System.out.println( val+" -> "+ adj.get(val));
		}
	}
	
	
//	public static void main(String[] args) {
//		CreateGraph gg = new CreateGraph(3);
//		gg.addEdge(1, 2);
//		gg.addEdge(1, 3);
//		gg.addEdge(2, 3);
//		gg.addEdge(4, 3);
//		gg.addEdge(4, 3);
//		gg.addEdge(1, 4);
//		gg.addEdge(3, 1);
//		
//		gg.display();
//	}
}