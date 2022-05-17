package stackquestion;
import java.util.*;
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			}
		sc.close();
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		for(int i = 1; i<arr.length; i++)
		{
			while(!st.isEmpty() && arr[i]>arr[st.peek()] )
			{
				ans[st.pop()] = arr[i];
			}
			st.push(i);
			
		}
		while(!st.isEmpty())
		{
			ans[st.pop()] = -1;
		}
		System.out.println(Arrays.toString(ans));
		
	}

}
