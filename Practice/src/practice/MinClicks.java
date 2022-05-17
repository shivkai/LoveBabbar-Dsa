package practice;
import java.io.*;
import java.util.*;
class MinClicks{
	public static void func(HashMap<Integer,List<Integer>> mp,int x,int y,int n) {
		Vector<Boolean> vis = new Vector<>();
		for(int i=0;i<=n;i++)
		{
			vis.addElement(false);
		}
		Vector<Integer> dis = new Vector<>();
		for(int i=0;i<=n;i++)
		{
			dis.addElement(0);
		}
		
		Queue<Integer> qq = new LinkedList<>();
		dis.setElementAt(0, x);
		vis.setElementAt(true, x);
		qq.add(x);
		boolean op = false;
		while(!qq.isEmpty())
		{
			int a = qq.peek();
			qq.poll();
			List<Integer> ll = mp.get(a);
			for(int p : ll)
			{
			
				if(x==p||vis.elementAt(p))
				{
					continue;
				}
				else {
					dis.setElementAt(dis.get(p)+1, p);
					qq.add(p);
					vis.setElementAt(true, p);
					if(p==y)
					{
						op = true;
						break;
					}
				}
			}
			if(op==true)
			{
				break;
			}
		}
		if(op==true) {
	int ans = 0;
		for(int d : dis)
		{
			ans+=d;
		}
		System.out.println(ans);
		}
		else {
		System.out.println(-1);
		}
	}
public static void main(String[] args) throws IOException{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  List<Integer> ll;
  BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
  HashMap<Integer,List<Integer>> mp = new HashMap<>();
  for(int i = 1;i<=n;i++){
  String str = bfn.readLine();
  String s ="";
  ll= new ArrayList<>();
  for(int j=0;j<str.length();j++)
  {
	  if(str.charAt(j)==' ')
	  {
		ll.add(Integer.parseInt(s));
		s="";
	  }
	  else {
		  s+=str.charAt(j);
	  }
	  
  }
  ll.add(Integer.parseInt(s));
  mp.put(i, ll);
  }
  int x = sc.nextInt();
  int y= sc.nextInt();
  sc.close();
func(mp,x,y,n);



  
}
}