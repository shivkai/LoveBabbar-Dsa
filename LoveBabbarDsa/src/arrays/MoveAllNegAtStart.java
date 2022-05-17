package arrays;

public class MoveAllNegAtStart {
	public static void swap(int[] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2,  -4, -5, 2, -7, 3,
                2, -6, -8, -9, 3, 2,  1};
		
		int n = arr.length;
		int i=0,k=0;
		while(k<n) {
			if(arr[k]<0)
			{
				swap(arr,k,i);
				i++;
			}
			k++;
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
