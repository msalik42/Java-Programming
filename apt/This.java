class This
{
	String name = "Aptech";
	void fn()
	{
		String name = "Varags";
		System.out.println("Welcome "+this.name);
	}
	public static void main(String ar[])
	{
		This td = new This();
		td.fn();
	}
}