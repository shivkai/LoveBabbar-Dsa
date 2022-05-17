package stackquestion;
import java.util.*;
public class BaseballGame {

	public static void main(String[] args) {
		
		String[] arr = {"5","2","C","D","+"};
		Stack<Integer> st = new Stack<>();
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]=="C")
			{
			 st.pop();
			}
			else if(arr[i] == "D")
			{
				st.push(2*st.peek());
			}
			else if(arr[i] == "+")
			{
				int prev = st.pop();
				int prevNext = st.peek();
				int score = prev+prevNext;
				st.push(prev);
				st.push(score);
			}
			else {
				st.push(Integer.parseInt(arr[i]));
			}
		}
		while(!st.isEmpty())
		{
			sum+=st.pop();
		}
		System.out.println(sum);
	}

}
