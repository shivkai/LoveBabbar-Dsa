package stackquestion;
import java.util.*;
public class NextGreaterToCurrent {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t>0)
	{
	int n = sc.nextInt();
		int[] arr = new int[n];
		int[] ans = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		Stack<Integer> st = new Stack<>();
		st.push(0);
		
		for(int i = 1; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[i]>arr[st.peek()])
			{
//				System.out.println(arr[st.pop()]+","+arr[i]);
				ans[st.pop()] = arr[i]; 
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
//			System.out.println(arr[st.pop()]+", -1");
			ans[st.pop()] = -1;
		}
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i]+","+ans[i]);
		}
		t--;
	}
	sc.close();
	}

}
