package queueQuestions;
import java.util.*;
public class AppendKInLinkedList {
	public static class Node{
		int val;
		Node next;
		public Node(int val)
		{
			this.val = val;
			this.next = null;
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		Node head= null,temp = null;
		for(int i=0;i<n;i++)
		{
			Node nn = new Node(sc.nextInt());
			if(head==null)
			{
				head=nn;
				temp = nn;
			}
			else {
				temp.next = nn;
				temp = temp.next;
			}
		}
		temp = head;
		int t = sc.nextInt();
		sc.close();
		
		t=t%n;
		if(t==0)
		{
			while(temp!=null)
			{
				System.out.println(temp.val);
				temp = temp.next;
			}
			return;
		}
		int c=0;
		while(c!=n-t-1 )
		{
		   temp = temp.next;
		   c++;
		}
		Node nn = temp.next;
		temp.next = null;
		temp = nn;
		
		while(nn.next!=null)
		{
			nn=nn.next;
		}
		nn.next = head;
		
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		
	}

}
/*
7
1 2 2 1 8 5 6
3
*/