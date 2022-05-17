package arrays;

import java.util.Scanner;

public class MaxAndMinInArray {
	private static int Max(int[] arr) {
		int a = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>a)
			{
				a=arr[i];
			}
		}
		return a;
	}
	private static int Min(int[] arr) {
		int a = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<a)
			{
				a=arr[i];
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Max Element : "+Max(arr));
		System.out.println("Min Element: "+ Min(arr));
	}

}
