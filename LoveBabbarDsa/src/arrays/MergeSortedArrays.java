package arrays;

public class MergeSortedArrays {
	private static int[] merge(int[] arr1,int[] arr2) {
		int i1=0,i2=0;
		int[] arr3=new int[arr1.length+arr2.length];
		int z=0;
		while(i1<arr1.length && i2<arr2.length && z<arr1.length+arr2.length)
		{
			if(arr1[i1]<arr2[i2])
			{
				arr3[z++] =  arr1[i1];
				i1++;
			}
			else if(arr2[i2]<arr1[i1])
			{
				arr3[z++] = arr2[i2];
				i2++;
			}
			else {
				arr3[z++] = arr2[i2];
				arr3[z++] = arr1[i1];
				i2++;i1++;
			}
		}
		while(i1<arr1.length && z<arr1.length+arr2.length)
		{
			arr3[z++] = arr1[i1];
			i1++;
		}
		while(i2<arr2.length && z<arr1.length+arr2.length)
		{
			arr3[z++] = arr2[i2];
			i2++;
		}
		return arr3;
	}
	public static void main(String[] args) {
		int arr1[] = {1, 3, 4, 5};
		int arr2[] = {2, 4, 6, 8};
		int[] arr3=merge(arr1,arr2);
		for(int a:arr3)
		{
			System.out.print(a+" ");
		}
	}

}
