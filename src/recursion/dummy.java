package recursion;

import java.util.Arrays;

public class dummy
  {
	  public static void main(String args[])
	  {
       int []a= {45,35,25,55,15,5};
      
       
       for(int i=0;i<a.length;i++)
       {
    	   System.out.print(a[i]+" ");
       }
	   System.out.println();

       
       
       for(int i=0;i<=a.length-1;i++)
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]>a[j])
    		   {
    		   a[i]=a[i]^a[j];
    		   a[j]=a[i]^a[j];
    		   a[i]=a[i]^a[j];
    		   }
    	   }
       }
       for(int i=0;i<a.length;i++)
       {
    	   System.out.print(a[i]+" ");
       }
        
	  }
  }