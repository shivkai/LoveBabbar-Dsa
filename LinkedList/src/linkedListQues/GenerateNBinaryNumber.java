package linkedListQues;
import java.util.*;
public class GenerateNBinaryNumber {
	public static void binaryPrint(int n)
	{
		Queue<String> st = new LinkedList<>();
		st.add("1");
		while(n-->0)
		{
			String s1 = st.peek();
			st.remove();
			System.out.print(s1+" ");
			String s2 = s1;
			st.add(s1+"0");
			st.add(s2+"1");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		binaryPrint(n);
	}

}
