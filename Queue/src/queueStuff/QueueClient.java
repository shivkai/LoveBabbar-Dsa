package queueStuff;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue st = new Queue(3);
		
	st.enqueue(5);st.enqueue(15);st.enqueue(25);
	st.display();
	st.dequeue();
	st.enqueue(89);
	System.out.println(st.getLast());
		st.display();
	
	}

}
