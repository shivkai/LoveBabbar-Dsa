package stackquestion;
//import java.util.*;
public class Wires {

	public static boolean wirePossible(char a, char b) {
		if(a==b)
			return true;
		else
			return false;
	};
	public static void main(String[] args) {
		
		
		String str = "-++-";
//		Stack<Character> st = new Stack<>();
		for(int i=0; i < str.length();i++)
		{
			if(wirePossible(str.charAt(i),str.charAt(i+1)))
			{
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
