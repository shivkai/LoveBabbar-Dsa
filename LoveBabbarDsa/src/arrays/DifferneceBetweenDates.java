package arrays;
import java.util.*;
public class DifferneceBetweenDates {

	public static void main(String[] args) {
		int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		
		int  a1 = Integer.parseInt( s1.substring(0,2));
		int a2 = Integer.parseInt(s1.substring(3,s1.length()));
		int  b1 = Integer.parseInt( s2.substring(0,2));
		int b2 = Integer.parseInt(s2.substring(3,s2.length()));
		
		if(a2==b2)
		{
			System.out.println(Math.abs(a1-b1));
		}
		else if(a2<b2)
		{
			int ans = (arr[a2] - a1) +b1; 
			System.out.println(ans);
		}
		else {
			int ans = (arr[b2] - b1) +a1; 
			System.out.println(ans);
		}
	}

}
