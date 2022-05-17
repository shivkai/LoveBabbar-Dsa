package arrays;

public class NextPermutation {
	private static void swap(int []arr,int i,int j) {
		// TODO Auto-generated method stub
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

	}
	private static void reverse(int arr[],int i,int j) {
		// TODO Auto-generated method stub
		int mid = i+j /2;
		for(int a=i;a<mid;a++)
		{
		swap(arr,a,j);	
		}
		
	}
	private static void Perm(int[] arr,int n) {
		int last = n-2;
		while(last>=0)
		{
			if(arr[last]<=arr[last+1])
			{
				break;
			}
			last--;
		}
		int nxt = n-1;
		for(int i=n-1;i>last;i++)
		{
			if(arr[i]>arr[last])
			{
				nxt = i;
				break;
			}
		}
		swap(arr,last,nxt);
		reverse(arr,last+1,n-1);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int len = arr.length;
		Perm(arr,len);
		for(int a=0;a<arr.length;a++)
		{
			System.out.println(arr[a]);
		}
	}

}
