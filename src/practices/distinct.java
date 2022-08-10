package practices;

import java.util.Scanner;

public class distinct
{
	static void dis(int []a,int size)
	{
		for(int i=0;i<size;i++)
		{
			int j;
			for(j=0;j<i;j++)
				
				if (a[i]==a[j])
					break;
			if(i == j)
				System.out.print(a[i]+" ");
		}
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,4};
		int size=a.length;
		dis(a,size);
    }
}
