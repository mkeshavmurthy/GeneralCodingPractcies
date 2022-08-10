package practices;

import java.util.Scanner;

public class reverse
{
	public static void main(String[] args) 
	{
		String x=" ";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the word");
		x=scan.nextLine();
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
       System.out.println(a);  
       System.out.println(y);
	}
}
