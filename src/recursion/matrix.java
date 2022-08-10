package recursion;

import java.util.Scanner;

class matrix
{
	static int chegus(String s,String w)
	{
		String a[]=s.split(" ");
		 int count=0;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(w.equals(a[i]))
			 {
				 count++;
			 }
			 return count;
		 }
		return count;
	}
	 
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
	String s=scan.nextLine();
	System.out.println("enter the word");
	String w=scan.next();
	System.out.println(chegus(s,w));
	}
}