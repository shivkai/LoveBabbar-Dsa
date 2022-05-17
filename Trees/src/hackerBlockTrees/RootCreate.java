package hackerBlockTrees;
import java.util.*;
public class RootCreate {
	 private Scanner sc =new Scanner(System.in);
		private Node root;
		private static class Node{
			int val;
			Node left;
			Node right;
			

			public Node(int val)
			{
				this.val = val;
			}
		}
		
		public RootCreate() {
			root = construct();
		}
		
		private Node construct() {
			int n = sc.nextInt();
			boolean ls = sc.nextBoolean();
			Node nn  = new Node(n);
			if(ls==false)
			{
				nn.left = null;
			}
			else {
			nn.left = construct();
			}
			boolean rs = sc.nextBoolean();
			if(rs==false)
			{
				nn.right = null;
			}
			else {
			nn.right = construct();
			}
			
			return nn;
			
		}	
	public void display() {
		display(root);
	}
	private void display(Node root) {
		
		if(root==null)
		{
			return;
		}
		String str="";
		
		if(root.left!=null)
		{
			str+=root.left.val;
		}
		else {
			str+="_";
		}
		
		str+="->"+root.val+"<-";
		
		if(root.right!=null)
		{
			str+=root.right.val;
		}
		else {
			str+="_";
		}
		System.out.println(str);
		
		display(root.left);
		display(root.right);
	}
	
	public static void main(String[] args) {
		RootCreate rt = new RootCreate();
		rt.display();
	}

}
