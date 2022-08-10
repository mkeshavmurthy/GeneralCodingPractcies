package recursion;

import java.util.Scanner;

public class reverse2
{
	static String s="";
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the word");
		s=scan.nextLine();
        sam(s.length()-1);
    }
	static void sam(int i)
	{
		if (i>=0)
		{
			System.out.print(s.charAt(i));
			sam(i-1);
		}
	}
}
