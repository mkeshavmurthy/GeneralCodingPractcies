package practices;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the original string");
		String os=scan.next();
		System.out.println("enter a key string");
		String ks=scan.next();
		
		String ns=os.concat(os);
		
		if(ns.contains(ks))
		{
		System.out.println("string is rotational");
		}
		else
		{
			System.out.println("string are not rotational");
		}
	}

}
