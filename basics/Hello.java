class Hello
{
	int id;
	static int b;
	void method()
	{
		int a=40;
	
	System.out.println("non static id : "+id+" static : "+b+" local : "+a);
	}
	public static void main(String args[])
	{
		Hello sd = new Hello();
		sd.id=101;
		sd.b=102;
		sd.method();
		Hello.b=20;
		sd.id=40;
		sd.method();
	}
}