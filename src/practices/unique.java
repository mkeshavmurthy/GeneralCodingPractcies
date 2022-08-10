package practices;

import java.util.*;

public class unique
{

	public static void main(String[] args)
	{
		String x="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		x=scan.nextLine();
		char[]y=x.toCharArray();
		int size=y.length;
		
		Map<Character,Integer> hul=new HashMap<>();
		int i=0;
		while(i!=size)
		{
			if(hul.containsKey(y[i])==false)
			{
				hul.put(y[i], 1);
			}
			else
			{
				int o=hul.get(y[i]);
				int n=o+1;
				hul.put(y[i], n);
			}
			++i;
		}
		
		Set<Map.Entry<Character,Integer >> hap=hul.entrySet();
		for (Map.Entry<Character,Integer> data:hap)
		{
			if (data.getValue()>1)
			{
				System.out.println("dont have all unique characters");
				System.exit(0);
			}
		}
		System.out.println("contains all unique characters");
	}
}
