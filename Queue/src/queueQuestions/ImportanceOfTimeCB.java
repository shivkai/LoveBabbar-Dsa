package queueQuestions;
import java.util.*;
public class ImportanceOfTimeCB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		Deque<Integer> st = new ArrayDeque<>();
		for(int i=0;i<n;i++)
		{
			st.add(sc.nextInt());
		}
		
		for(int i = 0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		sc.close();
		
		int count = 0;
			for(int i=0;i<n;i++)
			{
				while(!st.isEmpty()) {
				if(st.peek()==nums[i])
				{
					st.pop();
					count++;
					break;
				}
				else {
				int a = st.pop();
				st.addLast(a);
				count++;
				}
				}
			}
			System.out.println(count);
		

	}

}
