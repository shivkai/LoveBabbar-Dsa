package queueQuestions;
import java.util.*;
public class ThreeNumberSumEqualToTarget {
	public static class Node{
		int val;
		Node next;
		
		Node(int val)
		{
			this.val = val;
			next=null;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt(),k = sc.nextInt();
		Node h1,h2,h3;
		h1=h2=h3=null;
		
		Node idx = h1;
		for(int i=0;i<n;i++)
		{
			Node n1 = new Node(sc.nextInt());
			if(h1==null)
			{
				h1 = n1;
				idx = n1;
			}
			else {
				idx.next = n1;
				idx = idx.next;
			}
		}
		idx = h2;
		for(int i = 0;i <m;i ++)
		{
			Node n2 = new Node(sc.nextInt());
			if(h2==null)
			{
				h2 = n2;
				idx = n2;
			}
			else {
				idx.next = n2;
				idx = idx.next;
			}
		}
		idx = h3;
		for(int i=0;i<k;i++)
		{
			Node n3 = new Node(sc.nextInt());
			if(h3==null)
			{
				h3 = n3;
				idx = n3;
			}
			else {
				idx.next = n3;
				idx  =idx.next;
			}
		}
		int target = sc.nextInt();
		sc.close();
		for(Node a = h1; a!=null ;a=a.next)
		{System.out.println("1");
			for(Node b =h2;b!=null;b=b.next)
			{System.out.println("2");
				for(Node c =h3;c!=null;c=c.next)
				{System.out.println("3");
					if(a.val+b.val+c.val == target) {
//						System.out.println(a.val+" "+b.val+" "+c.val);
						return;
					}
				}
			}
						
			
		}
		
		System.out.println(-1);
	}

}

//3 3 3
//12 6 29
//23 5 8
//90 20 59
//101
