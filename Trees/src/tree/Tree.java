package tree;
import java.util.*;
public class Tree {
	private Scanner sc = new Scanner(System.in);
	private class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val)
		{
			this.val = val;
		}
	}
	private Node root;
	
	public Tree() {
		root = construct();
	}
	
	public Node construct() {
		int n  = sc.nextInt();
		if(n==-1||n=='f')
		{
			return null;
		}
		Node nn = new Node(n);
		nn.left = construct();
		nn.right = construct();
		
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
		String ans = "";
		ans+=root.val+"<-";
		
		if(root.left!=null)
		{
			ans+=root.left.val;
		}
		else {
			ans+="_";
		}
		
		ans+="<-";
		
		if(root.right!=null)
		{
			ans+=root.right.val;
		}
		else {
			ans+="_";
		}
		System.out.println(ans);
		display(root.left);
		display(root.right);

	}
	
	public void isSame(Node n1,Node n2) {
		String m1 = preOrder(n1);
		String m2 = preOrder(n2);
		System.out.println("m1: "+m1);
		System.out.println("m2: "+m2);
//		if(m1==m2) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	
	private String preOrder(Node n) {
		
		if(n==null)
		{
			return "";
		}
		String ans = "";
		ans+=n.val;
		if(n.left!=null)
		{
			ans+=n.left.val+",";
		}
		else {
			ans+="null,";
		}
		
		if(n.right!=null)
		{
			ans+=n.right.val+",";
		}
		else {
			ans+="null";
		}
		return ans+preOrder(n.left)+preOrder(n.right);
	}
}
