class variables
{
	static int a;
	int b;
	void fn1()
	{
		System.out.println("value of a: "+a);
	}
	void fn2()
	{
		System.out.println("value of b: "+b);
	}
	
	public static void main(String ar[])
	{
		variables v1 = new variables();
		variables v2 = new variables();
		v1.a=10;
		v2.a=20;
		v1.fn1();
		v2.fn1();
		
		
		v1.b=10;
		v2.b=20;
		v1.fn2();
		v2.fn2();
	}
	
}