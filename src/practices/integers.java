package practices;

import java.util.Scanner;

public class integers 
{

	public static void main(String[] args)
	{
	String x=null;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string ");
	x=scan.nextLine();

	int size=x.length();
	int i=0;
	
	while(i!=size)
	{
		if(x.charAt(i)>='0' && x.charAt(i)<='9')
		{
			++i;
		}
		else
		{
			System.out.println("not an integer string");
			System.exit(0);
		}
	}
	System.out.println("integer string");
	}
}
