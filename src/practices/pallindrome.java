package practices;

import java.util.Scanner;

public class pallindrome
{
	public static void main(String[] args) 
	{
		String x=" ";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the word");
		x=scan.nextLine();
		x=x.replace(" ", "");
		x=x.toLowerCase();
        char y []=x.toCharArray();
        int size=y.length;
        char a []=new char[size];
        int i=0;
        int count=0;
       while(i!=size)
       {
    	   a[size-1-i]=y[i];
    	   ++i;
       }
       i=0;
       while(i!=size)
       {
    	   if(a[i]!=y[i])
    	   { 
    		   System.out.println("not a palindrome");
    		   System.exit(0);
    	   }
    	   else
    	   {
    		   ++i;
    		   
    	   }
       }
       System.out.println("pallindrome");  
	}
}
