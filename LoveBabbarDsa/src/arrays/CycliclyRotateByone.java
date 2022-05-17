package arrays;

import java.util.Arrays;

public class CycliclyRotateByone {

	public static void main(String[] args) {
		int k=1;
		int arr[] = {1, 2, 3, 4, 5};
		int rot[] = new int[arr.length];
		int z=0;
		for(int i=arr.length-k;i<arr.length;i++)
		{
			rot[z++] = arr[i];
		}
		for(int i= 0;i<arr.length-k;i++)
		{
			rot[z++] = arr[i];
		}
		System.out.println(Arrays.toString(rot));
	}

}
