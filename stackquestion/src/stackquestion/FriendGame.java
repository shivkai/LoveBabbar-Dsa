package stackquestion;
import java.util.*;
public class FriendGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "25426251";
		String ans = "";
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<=s.length();i++)
		{
			st.push(i+1);
			char ch = 'D';
			if(i<s.length() && (s.charAt(i)-'0')%2==0)
			{
				ch = 'I';
			}
			if(i==s.length() || ch=='I')
			{
				while(!st.isEmpty())
				{
				ans+=st.pop();
				}
			}
		}
		System.out.println(ans);
	}

}
