package stackquestion;
import java.util.*;
public class SimpleCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(1+(4+5+2)-3)+(6+8)";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit( str.charAt(i))) {
				st.push(str.charAt(i));
			}
//			if()
		}
		
	}

}
