package stackquestion;
import java.util.*;
public class AsteroidCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ast = {10,-2,5};
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<ast.length;i++)
		{
		if(ast[i]>0)
		{
			st.push(ast[i]);
		}
		else {
			while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(ast[i]))
			{
			System.out.println( st.pop());	
//			st.push(ast[i]);
			}
			if( st.isEmpty() || st.peek()<0)
			{
				st.push(ast[i]);
			}
			else if(st.peek() == Math.abs(ast[i]))
			{
				st.pop();
			}
			}
		}
		
		
		System.out.println(st);
		
	}

}
