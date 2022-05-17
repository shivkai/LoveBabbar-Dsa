package linkedListQues;
public class ReverseLinkedList {
	public static class LinkedList{
		
		public class Node{
			int val;
			Node next;
			
			public Node(int val) {
				this.val = val;
				this.next = null;
			}
			public Node(int val,Node next)
			{
				this.val = val;
				this.next  = next;
			}
		}
		
		private Node head;
		private Node tail;
		private int size;
		
		public LinkedList()
		{
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		
		public LinkedList(Node head, Node tail, int size)
		{
			this.head = head;
			this.tail = tail;
			this.size = size;
		}
		
		public int size() {
			return this.size;
		}
		
		public boolean isEmpty() {
			return this.size()==0;
		}
		
		public int getFirst() throws Exception{
			
			if(this.isEmpty())
			{
				throw new Exception("Empty List");
			}
			return this.head.val;
		}
		
		public int getLast() throws Exception{
			if(this.isEmpty())
			{
				throw new Exception("Empty List");
			}
			return this.tail.val;
		}
		
		public Node getNodeAtIndex(int idx) throws Exception{
		  if(this.isEmpty())
		  {
			  throw new Exception("Empty List");
		  }
		  if(idx<0 || idx >=this.size())
		  {
			  throw new Exception("Index Incorrect");
		  }
			Node temp = this.head;
			for(int i=0;i<idx;i++)
			{
				temp = temp.next;
			}
			return temp;
		}
		
		public int getAt(int idx) throws Exception{
			Node temp = getNodeAtIndex(idx);
			return temp.val;
		}
		
		public void addFirst(int val) {
			Node nn = new Node(val,this.head);
			if(this.head == null)
			{
				this.head = nn;
				this.tail = nn;
			}
			else {
				this.head = nn;
			}
			
			this.size++;
		}
		
		public void addLast(int val) {
			Node nn = new Node(val,null);
			if(this.isEmpty())
			{
				this.head = nn;
				this.tail = nn;
			}
			else {
				this.tail.next = nn;
				this.tail = nn;
			}
			this.size++;
		}
		
		public void addAtIndex(int idx, int val) throws Exception{
			if(idx==0)
			{
				this.addFirst(val);
			}
			else if(idx == this.size()) {
				this.addLast(val);
			}
			else {
				Node temp = this.getNodeAtIndex(idx-1);
				Node tt = temp.next;
				
				Node nn = new Node(val,tt);
				temp.next = nn;
				
				this.size++;
			}
		}
		
		public void display()
		{
			Node temp = this.head;
			while(temp!=null)
			{
				System.out.print(temp.val+" ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		public int removeFirst() throws Exception{
			if(this.isEmpty())
			{
				throw new Exception("Empty List");
			}
			int temp = this.head.val;
			if(this.size()==1)
			{
				this.head = null;
				this.tail = null;
			}
			else {
				this.head = this.head.next;
			}
			this.size--;
			return temp;
		}
		
		public int removeLast() throws Exception{
			if(this.isEmpty())
			{
				throw new Exception("Empty List");
			}
			int temp = this.tail.val;
			if(this.size()==1)
			{
				this.head = null;
				this.tail = null;
			}
			else {
				Node nn = this.getNodeAtIndex(this.size() - 2);
				nn.next = null;
				this.tail = nn;
			}
			this.size--;
			return temp;
		}
		
		public int removeAt(int idx) throws Exception{
			
			if(idx==0)
			{
				return this.removeFirst();
			}
			else if(idx==this.size()-1)
			{
				return this.removeLast();
			}
			else {
				Node nn = this.getNodeAtIndex(idx-1);
				Node nm = nn.next;
				Node np = nm.next;
				
				nn.next = np;
				nm.next  = null;
				this.size--;
				return nm.val;
			}
		}
		
		public void reverse(int k) throws Exception{
			LinkedList ans = new LinkedList();
			while(this.size!=0)
			{
				LinkedList curr = new LinkedList();
				
				for(int i=0;i<k;i++)
				{
					curr.addFirst(this.removeFirst());
				}
				
				if(ans.size ==0)
				{
					ans.head = curr.head;
					ans.tail = curr.tail;
					ans.size = curr.size;
				}
				else {
					ans.tail.next = curr.head;
					ans.tail = curr.tail;
					ans.size += curr.size;
				}
			}
			this.head = ans.head;
			this.tail = ans.tail;
			this.size = ans.size;
		}
		
		public int kthFromLast(int k) throws Exception{
			if(k<0)
			{
				throw new Exception("Index error");
			}
			if(k>=this.size)
			{
				throw new Exception("Index error");
			}
				
			Node t1 = this.head;
			Node t2 = this.head;
			
			int c = 0;
			while(c!=k)
			{
				t2=t2.next;
				c++;
			}
			while(t2!=null)
			{
				t1=t1.next;
				t2=t2.next;
			}
			return t1.val;
			
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(55);
		ll.addFirst(0);
		ll.addFirst(8);
		ll.addFirst(15);
		ll.addFirst(33);
		ll.addFirst(45);
		ll.display();
		System.out.println( ll.kthFromLast(4));
	}

}
