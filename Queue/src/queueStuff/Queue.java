package queueStuff;

public class Queue {

	int[] arr;
	int front;
	int size;
	public Queue() {
		this.arr = new int[5];
		this.front = 0;
		size = 0;
	}
	
	public Queue(int size) {
		this.arr = new int[size];
		this.front = 0;
		size = 0;
	}
	
	public boolean Empty() {
		if(this.size()==0)
		{
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.size;
	}
	
	public void display() {
		for(int i = 0; i<size; i++) {
			int idx = i + front;
			idx = idx % arr.length;
			System.out.print(arr[idx] + " ");
		}
	}
	
	public void enqueue(int val) throws Exception {
		int idx = front + size;
		idx = idx % arr.length;
		if(size == this.arr.length) {
			throw new Exception("Queue is Full");
		}
		else {
		arr[idx] = val;
		size++;
		}
		
	}
	public int dequeue() throws Exception{
		if(this.Empty()) {
			throw new Exception("Queue is Empty");
		}
		int temp = arr[front];
		arr[front] = 0;
		size--;
		front++;
		return temp;
		}
	
	public int getFront() throws Exception{
		if(this.Empty())
		{
			throw new Exception("Queue is Empty");
		}
		int temp = arr[front];
		return temp;
	}
	
	public int getLast() throws Exception{
		if(this.Empty())
		{
			throw new Exception("Queue is Empty");
		}
		int temp = arr[arr.length-1];
		return temp;
	}
}
