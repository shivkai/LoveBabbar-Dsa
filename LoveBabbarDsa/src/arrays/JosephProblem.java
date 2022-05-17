package arrays;

public class JosephProblem {
	public static int survivor(int n,int k)
	{
		if(n==1) return 0;
		int x = survivor(n-1,k);
		int y = (x+k)%n;
		return y;
	}
	public static void main(String[] args) {
		int n = 5,k=2;
		System.out.println(survivor(n,k));
	}

}
