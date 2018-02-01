class This2
{
	String   name = "salik";
	void fn(){
		String name = "Ansari";
		System.out.println(this.name);
	}
	public static void main(String ar[])
	{
		This2 n = new This2();
		n.fn();
	}
}