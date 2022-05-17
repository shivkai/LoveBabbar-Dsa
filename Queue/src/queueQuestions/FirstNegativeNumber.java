package queueQuestions;
import java.util.ArrayDeque;
import java.util.Deque;
public class FirstNegativeNumber {

	public static void main(String[] args) {
		int[] nums = { 12 ,-1, -7, 8, -15, 30, 16, 28 ,45,50,-55};
		int k = 3;
		Deque<Integer> dd = new ArrayDeque<>();
		for(int i = 0; i < nums.length; i++)
		{
			while(!dd.isEmpty() && nums[dd.getLast()]>=0)
			{
				dd.removeLast();
			}
			dd.addLast(i);
			
			if(i-k==dd.getFirst())
			{
				dd.removeFirst();
			}
			if(i>=k-1)
			{
				if(nums[dd.getFirst()]<0)
				{
					System.out.print(nums[dd.getFirst()]+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
		}
		System.out.println();
	}
}
//public class FirstNegativeNumber {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums = { 12 ,-1, -7, 8, -15, 30, 16, 28 ,45,50,-55};
//		int k = 3;
//		int i=0,j=k-1;
//		
//		while(j!=nums.length)
//		{
//			int temp = -1;
//			for(int a = i; a<=j;a++)
//			{
//				if(nums[a]<0)
//				{
//					temp = a;
//					break;
//				}
//				
//			}
//			if(temp==-1)
//			{
//				System.out.println("0");
//			}
//			else {
//				System.out.println(nums[temp]);
//			}
//			i++;j++;
//		}
//		
//	}
//
//}
