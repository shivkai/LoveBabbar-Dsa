package stackquestion;
import java.util.*;
public class InfixToPrefix {
	
	public static int order(char ch) {
		
		switch(ch) {
			case '+':
			case '-':
				return 1;
				
			case '*':
			case '/':
				return 2;
				
			case '^':
				return 3;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A*(B+C)/D";
		
		Stack<Character> st = new Stack<>();
		
		String ans = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isLetterOrDigit(ch))
			{
				ans+=ch;
			}
			
			else if(ch=='(')
			{
				st.push(ch);
			}
			
			else if(ch==')')
			{
				while(!st.isEmpty() && st.peek()!='(')
				{
					ans+=st.pop();
				}
				st.pop();
			}
			
			else {
				while(!st.isEmpty() && order(ch) <= order(st.peek()))
				{
					ans+=st.pop();
				}
				st.push(ch);
			}
		}
		while(!st.isEmpty())
		{
			ans+=st.pop();
		}
		System.out.println(ans);

	}

}
