package sorting;

public class selectionsort {

	public static void main(String[] args)
	{
		int []a= {89,68,45,90,23,17};
		int n=a.length;
		
		beta1 b=new beta1();
		b.ssort(a,n);
		
		gamma1 g=new gamma1();
		g.disp(a,n);
	}

}
