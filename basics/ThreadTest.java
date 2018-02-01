class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{	
		System.out.println("\tFrom ThreadA :i= "+i);
		}
	System.out.println("Exit from A ");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("\tFrom ThreadB :j= "+j);
		}
		System.out.println("Exit from B ");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("\tFrom ThreadC :k= "+k);
					
		}
	}
	System.out.println("Exit from C ");
	}
}
class ThreadTest
{
	public static void main(String ar[])
	{

		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadB.getPriority()+1);
		threadA.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Strat Thread A");
		threadA.start();
		
		System.out.println("Strat Thread B");
		threadB.start();

		System.out.println("Strat Thread C");
		threadC.start();

	}
}