package practices;


class demo1
{
private void disp()
{
	System.out.println("hi");
}
}


class demo2 extends demo1
{
	public void disp()
	{
		System.out.println("hello");
	}
}
	
	class sample
	{
	public static void main(String args[])
	{
	demo2 d=new demo2();
	d.disp();
	}
} 
