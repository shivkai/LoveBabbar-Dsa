package segmentTree;
import java.util.*;
public class SegmentTree {
	private static void buildTree(int[] arr,int[] st,int l,int r,int ci) {
		if(l==r)
		{
			st[ci] = arr[l];
			return;
		}
		int mid = (l+r)/2;
		buildTree(arr,st,l,mid,1+ci*2);
		buildTree(arr,st,mid+1,r,2*ci+2);
		st[ci] = st[1+ci*2]+st[2*ci+2];
	}
	public static int QuerySum(int[] st,int s,int e,int l,int r,int c)
	{
		if(e<l || r<s)
		{
			return 0;
		}
		else if(l<=s && r>=e)
		{
			return st[c];
		}
		int mid = (s+e)/2;
		return QuerySum(st,s,mid,l,r,1+c*2)+QuerySum(st,mid+1,e,l,r,2*c+2);
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,5,6,7,9};
		int st[] = new int[4*arr.length];
		buildTree(arr,st,0,arr.length-1,0);
		System.out.println(Arrays.toString(st));
	System.out.println(	QuerySum(st,0,arr.length-1,1,3,0));
	}

}
