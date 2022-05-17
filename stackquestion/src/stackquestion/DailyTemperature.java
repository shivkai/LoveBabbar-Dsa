package stackquestion;
import java.util.*;
public class DailyTemperature {

	public static void main(String[] args) {
		int[] temp = {30,40,50,60};
		Stack<Integer> st = new Stack<>();
		int[] idx = new int[temp.length];
		st.push(0);
		
		for(int i = 1; i<temp.length; i++)
		{
			while(!st.isEmpty() && temp[st.peek()]<temp[i])
			{
				idx[st.peek()] = i-st.pop();
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			idx[st.pop()] = 0;
		}
		
//		for(int i=0; i<temp.length; i++)
//		{
//			idx[i] = idx[i] - i;
//		}
		System.out.println(Arrays.toString(idx));
	}

}
