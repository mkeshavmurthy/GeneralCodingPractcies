package practices;

import java.util.Scanner;

public class deletealloccurances {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String x=scan.nextLine();
		char k= 'h';
		
		char y[]=x.toCharArray();
		
		int i=0;
        String result="";
        
        while(i!=y.length)
        {
        	if (y[i]!=k)
        	{
        		result=result+y[i];
        	}
        	++i;
        }
System.out.println(result);
	}

}
