package linkedListQues;
import java.util.*;
public class Merge2SortedLinkedList {
	public static class Node{
		int val;
		Node next;
		
		public Node(int val)
		{
			this.val = val;
			this.next = null;
		}
	}
	static void mergeList(Node l1,Node l2)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		while(l1!=null && l2!=null)
		{
			if(l1.val<=l2.val)
			{
				ll.add(l1.val);
				l1 = l1.next;
			}
			else {
				ll.add(l2.val);
				l2 = l2.next;
			}
		}
		System.out.println(ll);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		
		while(t-->0)
		{
		int n1,n2;
		n1 = sc.nextInt();
		Node h1 = null,h2=null,temp =null;
		
		for(int i=0;i<n1;i++)
		{
			Node nn = new Node(sc.nextInt());
			if(h1 ==null)
			{
				h1 = nn;
				temp = nn;
			}
			else {
				temp.next = nn;
				temp = temp.next;
			}
		}
		temp = null;
		n2 = sc.nextInt();
		for(int i=0;i<n2;i++)
		{
			Node nn = new Node(sc.nextInt());
			if(h2 ==null)
			{
				h2 = nn;
				temp = nn;
			}
			else {
				temp.next = nn;
				temp = temp.next;
			}
		}
		sc.close();
		
		mergeList(h1,h2);
		
		
		}
	}

}
