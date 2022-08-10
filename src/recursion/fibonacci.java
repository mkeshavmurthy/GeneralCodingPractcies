package recursion;

public class fibonacci 
    {
	static int n1=0,n2=1,n3=0;
	static void fib(int c)
	{
		if (c>0)
		{
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(" "+ n3);
			fib(c-1);
		}
	}
	

	public static void main(String[] args) 
	{
		int c=15;
		System.out.print(n1+" "+n2);
		fib(c-2);


	}

}
