class Abc
{
	int a=0;
	void fn()
	{
		System.out.println(a);
	}
	public static void main(String ar[])
	{
		Abc obj1=new Abc();
		Abc obj2 = new Abc();
		obj1.a=10;
		
		
		obj2.a=20;
		obj1.fn();
		obj2.fn();
	}
}