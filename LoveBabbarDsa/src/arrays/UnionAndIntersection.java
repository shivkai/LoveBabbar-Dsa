package arrays;
import java.util.*;
public class UnionAndIntersection {

	public static void main(String[] args) {
		int a[] = {7, 1, 5, 2, 3, 6};
		int b[] =  {3, 8, 6, 20, 7};
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs1 = new HashSet<>();
		List<Integer> ll= new ArrayList<>();
		for(int e:a)
		{
			hs.add(e);
			
		}
		for(int e:b)
		{
			hs.add(e);
			hs1.add(e);
		}
		for(int i:a)
		{
			if(hs1.contains(i))
			{
				ll.add(i);
			}
		}
		System.out.println("Union: "+hs.toString());
		System.out.println("Intersection: "+ll.toString());
	}

}
