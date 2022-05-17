package practice;
import java.util.ArrayDeque;
import java.util.Deque;

public class PracticeDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;
		Deque<Integer> q = new ArrayDeque<>();

		for (int i = 0; i < nums.length; i++) {
			while (!q.isEmpty() && nums[q.getLast()] >= 0) {
				q.removeLast();
				System.out.println("1st");
			}
			q.addLast(i);

			if (q.getFirst() == i - k) {// q.size() > k
				q.removeFirst();
				System.out.println("2nd");
			}
			if (i >= k - 1) {
				System.out.println("3rd");
				if(nums[q.getFirst()] < 0)
				System.out.print(nums[q.getFirst()] +" '"+i+"' ");
				else
					System.out.println(0 + " ");
			}
			if(i==0)
			{
				System.out.println("break at 0");
			}
			if(i==1)
			{
				System.out.println("break at 1");
			}
			if(i==2)
			{
				System.out.println("break at 2");
			}
			
		}
	}

}
