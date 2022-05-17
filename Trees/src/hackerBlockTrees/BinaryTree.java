package hackerBlockTrees;
import java.util.*;
public class BinaryTree {
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
	
	public BinaryTree() {
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
	
	int target;
	public void pathToSum() {
		target = sc.nextInt();
		Deque<Integer> st = new ArrayDeque<>();
		pathToSum(root,st,0);
	}
	
	int flag =0;
	public void pathToSum(Node root,Deque<Integer> st,int csum) {
		if(root==null)
		{
			return;
			
		}
		if(csum+root.val==target) {
			flag = 1;
			st.add(root.val);
			while(!st.isEmpty())
			{
				System.out.println(st.removeFirst());
			}
			return;
		}
		if(flag==0) {
		st.add(root.val);
		pathToSum(root.left,st,csum+root.val);
		pathToSum(root.right,st,csum+root.val);
		}
		else {
			return;
		}
	}
	
	public void display() {
		display(root);
	}
	
	public void display(Node root)
	{
		if(root == null)
		{
			return;
		}
		String str = "";
		
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
	
	public int Lca() {
		int  p =sc.nextInt();
		int q = sc.nextInt();
		 return lca(root,p,q).val;
	}
	
	public Node lca(Node root,int p ,int q)
	{
		if(root ==null)
		{
			return null;
		}
		
		if(root.val==p || root.val == q)
		{
			return root;
		}
		
		Node left = lca(root.left,p,q);
		Node right = lca(root.right,p,q);
		
		if(left!=null && right!=null) {
			return root;
		}
		if(left==null)
		{
			return right;
		}
		return left;
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
//		bt.display();
//		bt.pathToSum();
		
		int ans = bt.Lca();
		System.out.println(ans);
	}

}
