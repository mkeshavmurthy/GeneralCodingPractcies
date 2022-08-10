package practices;

import java.util.Scanner;

public class prime 
{

	public static void main(String[] args) 
	{
		int n,x;
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the number");
      n=scan.nextInt();
      prime p=new prime();
      x=p.pn(n,2);
      
      if(x==1)
      {
    	  System.out.println(n+" is prime number");
      }
      
      else
      {
    	  System.out.println(n+" is not prime number");
      }
    }
	
	
	
	
	
	
	
	int pn(int y,int i)
	{
		if(i<y)	
		{
			if(y%i!=0)
			{
				return(pn(y,++i));
			}
			else
			{
				return 0;
			}
		}
     return 1;
	}
}
