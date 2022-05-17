package tree;

public class BinaryTreesPrac {
	int[] arr = {5,10,20,30,40,50,60};
	class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val  = val;
		}
	}
	private Node root;
	
	public void min() {
		System.out.println(min(root));
	}
	private int min(Node root) {
		if(root.left==null)
		{
			return root.val;
		}
		return min(root.left);
	}
	public void  construct(){
		root = createBst(arr, 0 , arr.length-1);
	}
	private Node createBst(int[] arr, int s , int e) {
		
		if(s>e)
		{
			return null;
		}
		int mid = (s+e) /2;
		Node nn = new Node(arr[mid]);
		nn.left = createBst(arr,s,mid-1);
		nn.right = createBst(arr,mid+1,e);
		
		return nn;
	}
	public void max() {
		System.out.println(max(root));
	}
	private int max(Node root) {
		if(root.right==null)
		{
			return root.val;
		}
		return max(root.right);
	}
	public void display() {
		display(root);
	}
	private void display(Node root) {
		if(root == null)
		{
			return;
		}
		String ans= "";
		if(root.left!=null)
		{
			ans+=root.left.val;
		}
		else {
			ans+="_";
		}
		
		ans+="-> "+root.val+" <-";
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {10,20,30,40,50,60};
		
		BinaryTreesPrac pp = new BinaryTreesPrac();
		pp.construct();
		pp.display();
	
	}

}
