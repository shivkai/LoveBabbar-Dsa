package queueQuestions;
import java.util.*;
public class ReverseAQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int n = 3;
		int[] nums = {1,2,3};
//		for(int i = 0; i < n; i++)
//		{
//			nums[i] = sc.nextInt();
//		}
		Deque<Integer> dd = new ArrayDeque<>();
		for(int i = 0; i < nums.length; i++)
		{
			dd.addFirst(nums[i]);
		}
		while(!dd.isEmpty())
		{
			System.out.print(dd.pop()+" ");
		}
		System.out.print("END");
	}

}
