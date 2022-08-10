package recursion;

import java.util.Scanner;

public class reverse
{
	static void sam(char[] y,int size)
	{
		char []a=new char[size];
		int i=0;
		while (i!=size)
		{
			a[size-1-i]=y[i];
			++i;
		}
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the word");
		String x=scan.nextLine();
        char y []=x.toCharArray();
        int size =y.length;
        sam(y,size);
    }
}
