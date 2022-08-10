package recursion;

import java.util.Scanner;

public class factorial 
{
    static int fact(int n)
    {
    	if(n==1)
    	{
		return 1;
    	}
    	else
    	{
    		return(n*fact(n-1));
    	}
    }
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to find its factorial");
		int x=scan.nextInt();
	System.out.println("factorial of "+x +" is: " + fact(x));	

	}
 
}
