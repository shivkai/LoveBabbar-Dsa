package practice;

public class Addcharinstring {

	public static void main(String[] args) {
		String str ="xxxxxxxx";
		int n=6;
		char ch = 'r';
		
		int m = str.length();
		String ans="";
		
		for(int i=0;i<m/2;i++)
		{
			ans+=str.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			ans+=ch;
		}
		for(int i=m/2;i<str.length();i++)
		{
			ans+=str.charAt(i);
		}
		System.out.println(ans);

	}

}
