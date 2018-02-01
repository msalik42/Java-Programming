class D
{
	void fn1(){
		System.out.println("D:fn1");
	}
}
class B extends D
{
	void fn2()
	{
		System.out.println("B:fn2");
	}
}
class C extends B
{
	void fn3()
	{
		System.out.println("C:fn3");
	}
}
class A extends c
{	
	void fn4()
	{
		System.out.println("A:fn4");
	}
	public static void main(String ar[])
	{
		class Impl{
		A a = new A();
		a.fn1();
		}
	}
}