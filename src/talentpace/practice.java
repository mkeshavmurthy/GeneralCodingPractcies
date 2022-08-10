package talentpace;

import java.util.*;

public class practice
{

	public static void main(String[] args)
	{
		int[]y= {1,2,3,2,4,5,4,6};
		int size=y.length;
		
		Map<Integer,Integer> m=new HashMap<>();
		int i=0;
		while(i!=size)
		{
			if(m.containsKey(y[i])==false)
			{
				m.put(y[i], 1);
			}
			else
			{
				int o=m.get(y[i]);
				int n=o+1;
				m.put(y[i], n);
			}
			++i;
		}
		System.out.println(m);
		
		Set<Map.Entry<Integer,Integer >> hmap=m.entrySet();
		for (Map  .Entry<Integer,Integer> data:hmap)
		{
		System.out.print(data.getKey());

		}
		}
}
