package practices;

import java.util.Scanner;

public class length
{
	public static void main(String[] args) 
	{
		String x=" ";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the word");
		x=scan.nextLine();
         x=x.concat("\0");
        char y []=x.toCharArray();
        int i=0;
        int count=0;
       while(y[i]!='\0')
       {
    	   ++i;
    	   ++count;
       }
       System.out.println(count);  
	}
}
