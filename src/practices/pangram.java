package practices;

import java.util.Arrays;
import java.util.Scanner;

public class pangram 
{

	public static void main(String[] args)
	{
String x=null;

Scanner scan=new Scanner (System.in);
System.out.println("enter the sentance");
x=scan.nextLine();
x=x.replace(" ","");
x=x.toUpperCase();

char[]y=x.toCharArray();
int size=y.length;

int [] a= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
int i=0;
while(i!=size)
{
	int index=y[i]-65;
	a[index]=1;
	++i;
}


i=0;
while(i!=a.length)
{
	if(a[i]==1)
	{
		++i;
	}
	else
	{
		System.out.println("not a pangram");
		System.exit(0);
	}
	}
System.out.println("pangram");
}
}
	