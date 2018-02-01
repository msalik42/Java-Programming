class Dm
{
	int id;
	static string cname;
	public static void main(String[] args)
	{
		Dm c = new Dm();
		c.id=40;
		Dm d = new Dm();
		d.id=50;
		System.out.println("Value of id of object c is : "+c.id);
		System.out.println("Value of id of object d is : "+d.id);
		Hello h = new Hello();
		h.method();
	
	}
}