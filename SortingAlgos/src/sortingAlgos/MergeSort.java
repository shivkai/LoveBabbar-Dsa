package sortingAlgos;
public class MergeSort {
	
	public static void mergesort(int[] arr ,int l,int r)
	{
		if(l<r)
		{
			int mid = l+(r-l)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			
			if(arr[mid]>arr[mid+1])
			{
				merge(arr,l,mid,r);
			}
		}
	}
	public static void merge(int[] arr ,int l, int mid, int r)
	{
		int i = l, j =mid+1,k=0;
		int[] ans = new int[r-l+1];
		while((i<=mid) && (j<=r))
		{
		
			if(arr[i]<arr[j])
			{
				ans[k++] = arr[i++];
			}
			else {
				ans[k++] = arr[j++];
			}
		}
		while(j<=r)
		{
			ans[k++] = arr[j++];
		}
		while(i<=mid)
		{
			ans[k++] =  arr[i++];
		}
		for(i=l,k=0;i<=r;i++,k++) {
			arr[i] = ans[k];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {38,27,43,39,8,2};
		mergesort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
