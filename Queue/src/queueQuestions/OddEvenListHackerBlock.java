package queueQuestions;
import java.util.*;
public class OddEvenListHackerBlock {
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
		Node head =null,temp = null;
		
		for(int i=0;i<n;i++)
		{
			Node nn = new Node(sc.nextInt());
			if(head == null)
			{
				head =nn;
				temp = nn;
			}
			else {
				temp.next = nn;
				temp = temp.next;
			}
		}
		sc.close();
		Node odd = head, oddHead = head, even = head.next, evenHead  = head.next;
		while(evenHead!=null && evenHead.next!=null)
		{
			oddHead.next = oddHead.next.next;
			oddHead = oddHead.next;
			
			evenHead.next = evenHead.next.next;
			evenHead = evenHead.next;
		}
		oddHead.next = even; 
		
		while(odd!=null)
		{
			System.out.print(odd.val+" ");
			odd = odd.next;
		}
	}

}

