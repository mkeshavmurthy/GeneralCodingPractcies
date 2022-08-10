package practices;

import java.util.Scanner;

public class password 
{

	public static void main(String[] args) 
	{
		String x=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the password");
		x=scan.nextLine();
		x=x.toLowerCase();
		char y[]=x.toCharArray();
		int size=y.length;
		int i=0;
		int n=0;
		while(i!=size)
		{
			if(y[i]>='0'&&y[i]<='9')
			{
			n=++n;
			}
			++i;
		}
		
		
		int j=0;
		while(j!=size)
		{
			if(n>=2 && x.length()<=10)
			{
				if((y[j]>='a' && y[j]<='z') && (y[j]>='0' && y[j]<='9') )
				{
					System.out.println("valid password");
				System.exit(0);
				}
			}
			else
			{
				 System.out.println("invalid password");
				 System.exit(0);
				 
			}
			++j;
		}
	}
}