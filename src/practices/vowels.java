package practices;

import java.util.Scanner;

public class vowels 
{

	public static void main(String[] args)
	{
	String x=null;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter some letters");
	x=scan.nextLine();
	char y[]=x.toCharArray();
	int size=y.length;
	int i=0;
	
	while(i!=size)
	{
		if(y[i]=='a'||y[i]=='e'||y[i]=='o'||y[i]=='i'||y[i]=='u')
		{
			System.out.println(y[i]);
			
		}
		++i;	
	}

	}

}
