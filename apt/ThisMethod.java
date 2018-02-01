class ThisMethod
{
	ThisMethod()
	{
		System.out.println("Constructor :: no parameter");
	}
	ThisMethod(int n)
	{
		System.out.println("Constructor :: int parameter");
	}
	ThisMethod(int i, int j)
	{
		System.out.println("Constructor :: int int parameter");
	}
	public static void main(String ar[])
	{
		ThisMethod n0 = new ThisMethod();
		ThisMethod n1 = new ThisMethod(1);
		ThisMethod n2 = new ThisMethod(1,2);
	
	}
}
/*
class ThisMethod
{
	ThisMethod()
	{
		this(1); //call the sigle parameter constructor
		System.out.println("Constructor :: no parameter");
	}
	ThisMethod(int n)
	{
		this(1,2); ////call the two parameter constructor
		System.out.println("Constructor :: int parameter");
		
	}
	ThisMethod(int i, int j)
	{
		System.out.println("Constructor :: int int parameter");
	}
	public static void main(String ar[])
	{
		ThisMethod n0 = new ThisMethod(); // calling of constructor with no parameter
		
	
	}
}
*/