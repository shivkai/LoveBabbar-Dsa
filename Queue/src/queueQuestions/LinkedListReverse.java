package queueQuestions;
import java.util.*;
public class LinkedListReverse {

	public static class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Node head = null, temp = null;
		
		for(int i = 0; i<n; i++)
		{
			Node nn = new Node(sc.nextInt());
			if(head == null)
			{
				head = nn;
				temp = nn;
			}
			else {
				temp.next = nn;
				temp = temp.next;
			}
		}
		sc.close();
		temp = head;
		
		if(n<k)
		{
			System.out.print(-1);
		}
		if(k==0 || head ==null)
		{
			while(temp!=null)
			{
				System.out.print(temp.val+" ");
				temp = temp.next;
			}
			return;
		}
		Node tt = head;
		int i=0;
		
		while(i!=k-1)
		{
			tt = tt.next;
			i++;
		}

		while(tt!=null && temp!=null )
		{
			int z = temp.val;
			temp.val = tt.val;
			tt.val = z;
			temp = tt.next;
			tt=tt.next;
			int c = 0;
			while(  tt!=null && tt.next!=null &&c!=k-1 )
			{
				tt = tt.next;
				c++;
			}
			
		}
//		tt.next= null;
		temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}

}
