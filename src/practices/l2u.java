package practices;

import java.util.Scanner;

public class l2u
{
	public static void main(String[] args) 
	{
		String x=" ";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the word");
		x=scan.nextLine();
        char y []=x.toCharArray();
        int size=y.length;
       y[0]=(char)(y[0]+32);
        int i=1;
        
       while(i!=size)
       {
    	   if(y[i]==' ')
    	   {
    	   y[i+1]=(char)(y[i+1]+32);
    	   }
    	   ++i;
       }
       System.out.println(y);  
       
	}
}
