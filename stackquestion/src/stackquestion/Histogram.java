package stackquestion;
import java.util.*;
public class Histogram {

	public static void main(String[] args) {
		int[] ht = {2,1,5,6,2,3};
		
		Stack<Integer> st = new Stack<>();
		int[] rse = new int[ht.length];
		st.push(0);
		for(int i=0;i<ht.length;i++)
		{
			while(!st.isEmpty() && ht[st.peek()]>ht[i])
			{
				rse[st.pop()] = i;
			}
			st.push(i);
			
		}
		while(!st.isEmpty())
		{
			rse[st.pop()] = ht.length;
		}
		
		
		int[] lse = new int[ht.length];
		st  = new Stack<>();
		st.push(0);
		lse[0] = -1;
		
		for(int i=1;i<ht.length;i++)
		{
			while(!st.isEmpty() && ht[st.peek()]>=ht[i])
			{
				st.pop();
			}
			if(!st.isEmpty())
			{
				lse[i] = st.pop();
			}
			else {
				lse[i] = -1;
			}
			st.push(i);
		}
System.out.println(Arrays.toString(rse));
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < ht.length; i++) {
			maxValue = Math.max(maxValue, ht[i]*(rse[i]-lse[i]-1));
		}
		System.out.println(maxValue);
	}

}
