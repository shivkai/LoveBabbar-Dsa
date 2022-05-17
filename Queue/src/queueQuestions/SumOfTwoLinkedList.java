package queueQuestions;
import java.util.*;
public class SumOfTwoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		LinkedList<Integer> lb = new LinkedList<>();
		LinkedList<Integer> nn = new LinkedList<>();
		for(int i = 0;i<n;i++)
		{
			ll.push(sc.nextInt());
		}
		for(int i=0;i<m;i++)
		{
			lb.push(sc.nextInt());
		}
		int count=0,b=0,a=0;
		while(!ll.isEmpty() || !lb.isEmpty())
		{
			if(!ll.isEmpty())
			{
			 a = ll.pop();
			}
			else {
				a=0;
			}
			if(!lb.isEmpty())
			{
			  b = lb.pop();
			}
			else {
				 b = 0;
			}
			
			
			int c = a+b;
			if(count!=0)
			{
			c += count;
			count=0;
			}
			
			if(c<10)
			{
				nn.addFirst(c);
			}
			else {
				count = c/10;
				c=c%10;
				nn.addFirst(c);
			}
		}
		if(count!=0)
		{
			nn.addFirst(count);
		}
//		System.out.println(nn);
		while(!nn.isEmpty())
		{
			System.out.print(nn.pop()+" ");
		}
sc.close();
	}

}
