package practice;

public class DistanceMaintained {
	public static boolean distanceMaintained(int[] input1,int input2)
	{
		int i=0;
		for( i=0;i<input1.length;i++)
		{
			if(input1[i]%2==0)
			{
				break;
			}
		}
		while(i<input1.length)
		{
			System.out.println(i);
			if(input1[i]%2!=0)
			{
				return false;
			}
			i+=input2+1;
		}
		return true;
	}
	public static void main(String[] args) {
		int input1[]= {67,76,55,99,80,33,21,24};
		int k =2;
		System.out.println( distanceMaintained(input1,k));

	}

}
