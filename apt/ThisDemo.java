class ThisDemo
{
	
	int x,y;
	void addNumber()
	{
		System.out.println("Sum is "+(x+y));
	}
	public static void main(String ar[])
	{
		ThisDemo td = new ThisDemo();
		td.init(2,3);
		td.addNumber();
	}
	void init(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}