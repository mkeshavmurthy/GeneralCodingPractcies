package practices;

import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{

	public static void main(String[] args)
	{
String x=null;
String y=null;
Scanner scan=new Scanner (System.in);
System.out.println("enter the 1st string");
x=scan.nextLine();
System.out.println("enter the 2nd string");
y=scan.nextLine();
x=x.replace(" ","");
y=y.replace(" ","");
x=x.toLowerCase();
y=y.toLowerCase();
char[]a=x.toCharArray();
char[]b=y.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
Boolean result=Arrays.equals(a, b);
if(result==true)
{
	System.out.println("strings are anagram");
}
else
{
	System.out.println("strings are not anagram");
}
	}

}
