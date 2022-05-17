package linkedList;

public class LinkedList {
	
	class Node {
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	private Node head;
	
	public int size() {
		int cnt = 0;
		Node temp = head;
		
		while(temp!=null)
		{
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}
	
	public void addFirst(int val) {
		Node nn = new Node(val);
		nn.next = head;
		head = nn;
	}
	
	public void addLast(int val) {
		Node nn = new Node(val);
		if(head==null)
		{
			addFirst(val);
		}
		else {
			Node curr 
		}
	}
	public Node NodeAtIndex(int idx) throws Exception{
		if(head == null)
		{
			throw new Exception("List is Empty");
		}
		if(idx < 0 || idx >= size())
		{
			throw new Exception("Incorrect Index");
		}
		Node temp = head;
		for(int i = 1; i<=idx; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	
	
	
	
}
