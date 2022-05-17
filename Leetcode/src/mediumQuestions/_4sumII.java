package mediumQuestions;
import java.util.*;
public class _4sumII {

	public static void main(String[] args) {
		int arr1[] = {1,2};
		int arr2[] = {-2,-1};
		int arr3[] = {-1,2};
		int arr4[]= {0,2};
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				int sum = arr1[i]+arr2[j];
				if(mp.containsKey(sum))
				{
					mp.put(sum, mp.get(sum)+1);
				}
				else {
					mp.put(sum, 1);
				}
			}
		}
		int ans=0;
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr4.length;j++)
			{
				int sum = arr3[i]+arr4[j];
				if(mp.containsKey(-1*sum)) {
					ans+=mp.get(-1*sum);
				}
			}
		}
		System.out.println(ans);
				}

}
