package practice;
import java.util.*;
public class CountChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=1,i;
		String ans= "";
		for(i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else {
				ans+=str.charAt(i)+""+count;
				count=1;
			}
			
		}
		if(i!=str.length() &&count>=1)
		{
			ans+=str.charAt(i)+""+count;
		}
		System.out.println(ans);
	}

}
