package talentpace;

public class explain 
{

	public static void main(String[] args) 
	{
      int []x= {3,4,5};
      int[] y=method(x);
      System.out.println(x[0]+x[1]+x[2]+":"+y[0]+y[1]+y[2]);
	}
	
     static int [] method(int [] x)
	{
    	 x[1]=7;
    	 return x;
	}

}
