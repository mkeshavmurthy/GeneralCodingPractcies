package recursion;

public class rc1
{
	static int c=0;
    public static void p()
    {
    	c++;
    	if(c<=5)
    	{
    	System.out.println(c+" " +"hello");
    	p();
    	}
    }
	public static void main(String[] args) 
	{
     p();
	}

}
