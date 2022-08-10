package sorting;

public class inserionsort {

	public static void main(String[] args)
	{
		int []a= {89,68,45,90,23,17};
		int n=a.length;
		
		beta2 b=new beta2();
		b.isort(a,n);
		
		gamma2 g=new gamma2();
		g.disp(a,n);
	}

}
