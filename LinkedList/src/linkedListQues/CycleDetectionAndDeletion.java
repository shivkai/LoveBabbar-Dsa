package linkedListQues;

public class CycleDetectionAndDeletion {
	public static class Node{
		int val;
		Node next;
		
		public Node(int val)
		{
			this.val = val;
			this.next = null;
		}
	}
	void detectAnddelete(Node head)
	{
		Node slow = head;
		Node fast = head;
		
		slow = slow.next;
		fast = fast.next.next;
		
		while(fast!=null && fast.next!=null) {
			if(slow==fast)
			{System.out.println("Cycle Detected.. commencing cycle deletion");
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		if(slow==fast)
		{
			slow = head;
			
			if(slow!=fast)
			{
				while(slow.next!=fast.next)
				{
					slow = slow.next;
					fast = fast.next;
				}
				fast.next = null;
			}
//			else {
//				
//			}
		}
	}
	void printList(Node head)
	{System.out.println();
		System.out.println("List after Cycle deletion: ");
		while(head!=null)
		{
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		CycleDetectionAndDeletion nn = new CycleDetectionAndDeletion();
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next.next;
		
		nn.detectAnddelete(head);
		nn.printList(head);
		

	}

}
