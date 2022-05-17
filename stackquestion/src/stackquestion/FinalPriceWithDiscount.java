package stackquestion;
import java.util.*;
public class FinalPriceWithDiscount {

	public static void main(String[] args) {
		int[] prices = {10,1,1,6};
		int[] ans = new int[prices.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i = 1; i<prices.length;i++)
		{
			
			while(!st.isEmpty() && prices[st.peek()]>=prices[i])
			{
				ans[st.pop()] = prices[i];
			}
			st.push(i);
		}
		for(int i = 0; i<prices.length; i++)
		{
			ans[i] = prices[i]-ans[i];
		}
		System.out.println(Arrays.toString(ans));

	}

}
