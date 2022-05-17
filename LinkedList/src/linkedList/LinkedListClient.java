package linkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(85);
		ll.addFirst(45);
		ll.addFirst(02);
		ll.display();
		System.out.println(ll.NodeAtIndex(2).val);
	}

}
