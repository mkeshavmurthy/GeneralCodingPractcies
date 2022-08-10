package practices;

import java.util.*;

public class fnr
{

	public static void main(String[] args)
	{
		String x="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		x=scan.nextLine();
		char[]y=x.toCharArray();
		int size=y.length;
		
		Map<Character,Integer> Map=new LinkedHashMap<>();
		int i=0;
		while(i!=size)
		{
			if(Map.containsKey(y[i])==false)
			{
				Map.put(y[i], 1);
			}
			else
			{
				int o=Map.get(y[i]);
				int n=o+1;
				Map.put(y[i], n);
			}
			++i;
		}
		
		Set<Map.Entry<Character,Integer >> hmap=Map.entrySet();
		for (Map.Entry<Character,Integer> data:hmap)
		{
			if (data.getValue()==1)
			{
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
		
	}
}
