package tree;
import java.util.*;
public class CreateTree {
	private Scanner sc = new Scanner(System.in);
	
	class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;
		
	public CreateTree() {
		root = construct();
	}
	
	private Node construct() {
		int n = sc.nextInt();
		if(n==-1)
		{
			return null;
		}
		
		Node nn = new Node(n);
		nn.left = construct();
		nn.right = construct();
		
		return nn;
		
	}
	
	public void display()
	{
		display(root);
	}
	
	private void display(Node root) {
		if(root == null)
		{
			return;
		}
		String str = "";
		str+=root.val;
		str+="<-";
		
		if(root.left!=null)
		{
			str+=root.left.val;
		}
		else {
			str+="_";
		}
		
		str+="<-";
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
		CreateTree ct = new CreateTree();
		ct.display();
		
	}

}
