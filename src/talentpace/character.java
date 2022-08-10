package talentpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class character 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
	    String x=s.nextLine();
	    char[] y=x.toCharArray();
        
        int i,a=0,b=0;
        for(i=0;i<y.length;i++)
        {
        	a=i;
        	while(i!=' ')
        	{
        		b=i-1;
        		y[a]=y[b];
             	b=i-1;
        	}
        	++i;
        }
        
        for(i=0;i<y.length;i++)
        {
        	System.out.print(y[i]);
        }
	
	}
}
	