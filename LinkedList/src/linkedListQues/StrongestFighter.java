package linkedListQues;
import java.util.*;
public class StrongestFighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		sc.close();
		Stack<Integer> st = new Stack<>();
		int z=0,j=k-1;
			while(z<n && j<n)
			{
			int i =z;
			for( ;i<=j;i++)
			{
				st.push(nums[i]);
			}
			int ans = Integer.MIN_VALUE;
			while(!st.isEmpty())
			{
				int tt = st.pop();
				ans=Math.max(ans, tt);
			}
			System.out.print(ans+" ");
			z++;j++;
			}
		}
	
	}
