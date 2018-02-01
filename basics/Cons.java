class Cons{
	int a,b,c;
	Cons()
	{
		
		a=10;
		b=20;
		c=30;
		System.out.println(+a+" : "+b+" : "+c);
	}
	
	int volume()
	{
		return a*b*c;
	}
	public static void main(String a[])
	{
		Cons c1 = new Cons();
		//Cons c2 = new Cons(20,"salik");
		System.out.println("Volume is "+c1.volume());
	}
}