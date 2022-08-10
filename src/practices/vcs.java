package practices;

import java.util.Scanner;

public class vcs 
{

	public static void main(String[] args) 
	{
		String x=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a sentance");
		x=scan.nextLine();
		x=x.toLowerCase();
		char y[]=x.toCharArray();
		int size=y.length;
		int i=0;
		int vc=0;
		int cc=0;
	    int sc=0;
		
		while(i!=size)
		{
			if(y[i]>='a'&&y[i]<='z')
			{
				if(y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u')
				{
					
					++vc;
				}
				else
				{
					
					++cc;
				}
			}
			else
			{
				
				++sc;
			}
			++i;
		}
		
System.out.println("the number of vowels in the line are="+" "+vc );
System.out.println("the number of consonants in the line are="+" "+cc );
System.out.println("the number of special characters in the line are="+" "+sc );

	}
	

}
