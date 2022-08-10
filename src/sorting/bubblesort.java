package sorting;

public class bubblesort {

	public static void main(String[] args)
	{
		int []a= {89,68,45,90,23,17};
		int n=a.length;
		
		beta b=new beta();
		b.bsort(a,n);
		
		gamma g=new gamma();
		g.disp(a,n);

	}

}
