package recursion;

import java.util.Scanner;

class invalidCustomerException extends Exception
{
	public String getMessage()
	{
		return "invalid account details";
	}
}

class atm
{
	int acc_no=1234;
	int pass_wd=5678;
	int an,pw;
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the account number");
		an=scan.nextInt();
		System.out.println("enter the password");
		pw=scan.nextInt();		
	}
	
	void verify() throws Exception
	{
		if(an==acc_no && pw==pass_wd)
		{
			System.out.println("collect your goddamn money");
		}
		else
		{
			invalidCustomerException ice=new invalidCustomerException();
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}


class bank
{
	void initiate()
	{
		atm a=new atm();
		try
		{
			a.acceptInput();
			a.verify();
		}
		catch(Exception e)
		{
			try
			{
				a.acceptInput();
				a.verify();
			}
			catch(Exception f)
			{
				try
				{
				a.acceptInput();
				a.verify();			
			    }
				catch(Exception g)
				{
					System.exit(0);
				}
		}
	}
	}
} 

class cusExp
{
	public static void main(String args[])
	{
		bank b=new bank();
		b.initiate();
	}
}