class datatype
{
	void fn(short n)
	{
		System.out.println("short"); // use fn((short)2)
	}
	void fn(long n)
	{
		System.out.println("long"); // 2 goes to this method if not bind with int//
	}
	void fn(int n)
	{
		System.out.println("int");	//2 goes to this function by default.
	}
	public static void main(String ar[])
	{
		datatype n = new datatype();
		char 
		n.fn(2);
	}
}