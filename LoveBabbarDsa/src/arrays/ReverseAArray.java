package arrays;
import java.util.*;
public class ReverseAArray {
	private static void swap(int i,int j ,int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	private static void reverse(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j)
		{
			swap(i,j,arr);
			i++;j--;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	

}
