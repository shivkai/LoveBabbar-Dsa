package practice;
import java.util.*;
public class UniqueStringPermutations {
	static Map<String,Integer> mm = new HashMap<String,Integer>();
	static int z=1;
	public static void permu(String ss,String ans)
	{
		if(ss.length()==0)
		{
			if(!mm.containsKey(ans))
			{
				mm.put(ans,z++);
			}
			return;
		}
		for(int i=0;i<ss.length();i++)
		{
			char ch = ss.charAt(i);
			String ros = ss.substring(0,i)+ss.substring(i+1);
			permu(ros,ans+ch);
		}
	}
	static private HashMap<String,Integer> sortByValue(Map<String,Integer> mm)
	{
	List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(mm.entrySet());
	Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
		public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2)
		{
			return o1.getValue() - o2.getValue();
		}
	});
	HashMap<String,Integer> tt = new LinkedHashMap<String,Integer>();
	for(Map.Entry<String, Integer> aa : list)
	{
		tt.put(aa.getKey(), aa.getValue());
	}
	return tt;
	
	}

	public static void main(String[] args) {
		String ss = "abbc";
		permu(ss,"");
		Set<String> lm = mm.keySet();
//		for(String mo :mm.keySet())
//		{
//			
//			System.out.println(mo);
//		}
//		int max=Integer.MIN_VALUE;
//		for(int i:mm.values())
//		{
//			max= Math.max(max,i);
//			System.out.println(i+" ");
//		}
//		System.out.println("MAX: "+max);
//		mm.forEach((K,V)->System.out.println(K+" "+V));
		Map<String,Integer> map = sortByValue(mm);
		map.forEach((k,v)->System.out.println(k+" "+v));
	}

}
