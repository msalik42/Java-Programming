class Statik
{
	void Demo()
	{
		System.out.println("From non static Demo");
	}
	static void Impl()
	{
		System.out.println("Form static Impl");
	}
	public static void main()
	{
		Statik a = new Static();
		a.Impl();
		a.Demo();
	}
}