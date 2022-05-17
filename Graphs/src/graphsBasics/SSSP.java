package graphsBasics;

import java.util.*;


public class SSSP {
//	SSSP = Single source shortest path
	private void ShortesPath(int src,int n,Map<Integer,List<Integer>> ll) {
		Map<Integer,Integer> dis = new HashMap<>();
		for(int i=1;i<=n;i++)
		{
			dis.put(i, Integer.MAX_VALUE);
		}
		Queue<Integer> qq = new LinkedList<>();
		qq.add(src);
		dis.put(src, 0);
		while(!qq.isEmpty())
		{
			int front = qq.poll();
			List<Integer> aa = ll.getOrDefault(front, new ArrayList<>()); 

			for(int a : aa)
			{			
				if(dis.get(a)!=null && dis.get(a) == Integer.MAX_VALUE) {
			int frontDistance = dis.get(front);
			int neighbourDistance = frontDistance+1;
			qq.add(a);
			dis.put(a, neighbourDistance);
				}
			}
				
		}
		System.out.println(dis);

	}

	public static void main(String[] args) {
		CreateGraph g = new CreateGraph(7);
		g.addEdge(1, 2, true);
		g.addEdge(1, 3, true);
		g.addEdge(2, 4, true);
		g.addEdge(3, 4, true);
		g.addEdge(3, 5, true);
		g.addEdge(5, 6, true);
//		g.addEdge(6, 7, false);
		g.display();
	System.out.println();
		for(int i : g.adj.keySet())
		{
			System.out.println(g.adj.get(i));
		}
		SSSP ss = new SSSP();
		ss.ShortesPath(1,7, g.adj);
	}

}

