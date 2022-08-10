 package recursion;
class bathroom implements Runnable
{
	 public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" entered the bathroom");
				try {
					t.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		System.out.println(name+" uses bathroom ");
		try {
			t.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		System.out.println(name+" exited the bathroom");
		
	}
}

class mt
{
	public static void main(String ars[]) throws InterruptedException 
	{
		bathroom b=new bathroom();
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
	t1.setName("boy");
	t2.setName("girl");
	t3.setName("others");
	t1.start();
    t1.join();
	t2.start();
    t2.join();
	t3.start();
    t3.join();

	}
}