package practices;

import java.util.*;

public class words {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the sentance");
		String x=scan.nextLine();
	    char y[]=x.toCharArray();
	    
	     int i=0;
	     int words=1;
	     
	      while(i!=y.length)
	      {
	    	  if(y[i]==' ' && y[i+1]!=' ')
	    	  {
	    		  words=words+1;  
	    	  }
	    	  ++i;
	      }
	    	
	    	 System.out.println("the words in the sentance are:-" + words);
	}
	

}
