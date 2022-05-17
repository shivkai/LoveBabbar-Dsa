package practice;

import java.util.*;

public class Chugu {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> mm = new HashMap<>();
		HashMap<Integer,Integer> ans = new HashMap<>();
		
		for(int i=0;i<input1;i++)
		{
			if(mm.containsKey(input2[i]))
			{
				if(!ans.containsKey(input2[i]))
				{
					ans.put(input2[i],i);
				}
				continue;
			}
			mm.put(input2[i], i);
		}
	List<Integer> ll = new ArrayList<>();
	for(Integer in :ans.keySet())
	{
		ll.add(in);
	}
	if(ll.size()==0)
	{
		ll.add(-1);
		return Arrays.asList(ll);
	}
return Arrays.asList(ll);
	}
}
