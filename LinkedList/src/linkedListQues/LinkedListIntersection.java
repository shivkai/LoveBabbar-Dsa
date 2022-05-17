package linkedListQues;
import java.util.*;
public class LinkedListIntersection {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		LinkedList<Integer> l1 = new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			l1.add(sc.nextInt());
		}
		
		int m = sc.nextInt();
		LinkedList<Integer> l2 = new LinkedList<>();
		for(int i=0;i<m;i++)
		{
			l2.add(sc.nextInt());
		}
		sc.close();
		
		int s1 = l1.size();
		int s2 = l2.size();
		int diff;
		
		LinkedList<Integer> t1 = new LinkedList<>();
		LinkedList<Integer> t2 = new LinkedList<>();
		if(s1>=s2)
		{
			diff = s1-s2;
			
			t1 = l1;
			t2 = l2;
		}
		else {
			diff = s2-s1;
			t1 = l2;
			t2 = l1;
		}
		int c=0;
		while(c<diff)
		{
			t1.pop();
			c++;
		}
		
		while(t1!=null && t2!=null)
		{
			int a = t1.pop();
			int b = t2.pop();
			
			if(a==b)
			{
				System.out.println(a);
				return;
			}
		}
		System.out.println(-1);
	}
}
