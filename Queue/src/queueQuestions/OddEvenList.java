package queueQuestions;
import java.util.*;
public class OddEvenList {
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
		
		int n = sc.nextInt();
		Node head = null, temp = null;
		
		for(int i=0;i <n;i++)
		{
			Node nn = new Node(sc.nextInt());
			if(head==null)
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
		
		Node odd = null;
		Node even  = null;
		Node oddh = null;
		Node evenh  = null;
		
		while(temp!=null)
		{
		   if(temp.val%2==0)
		   {
			   Node nn = new Node(temp.val);
			   if(even == null)
			   {
				   even = nn;
				   evenh = nn;
			   }
			   else {
				   evenh.next = nn;
				   evenh = evenh.next;
			   }
		   }
			
		   temp = temp.next;
		   
		}
		temp = head;
		while(temp!=null)
		{
		   if(temp.val%2!=0)
		   {
			   Node nn = new Node(temp.val);
			   if(odd==null)
			   {
				   odd = nn;
				   oddh = nn;
			   }
			   else {
				   oddh.next = nn;
				   oddh = oddh.next;
			   }
		   }
		   temp = temp.next;
		}
oddh.next = even;
System.out.print("Original List: ");
while(head!=null)
{
	System.out.print(head.val+" ");
	head = head.next;
}
System.out.println();
System.out.print("Modified List: ");
		while(odd!=null)
		{
			System.out.print(odd.val+" ");
			odd = odd.next;
		}

	}

}
