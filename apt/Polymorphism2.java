/*class check
{
	int mul(int x,int y,int z)
	{
		return x*y*z;
	}
	int mul(int x,int y)
	{
		return x*y;
	}
	public static void main(String ar[])
	{
		check n = new check();
		System.out.println("Multipli cation of 2,3 is: "+n.mul(2,3));
	}
}
*/
class check
{
	int mul(int x,int y)
	{
		return x*y;
	}
	float mul(int x,float y)
	{
		return x*y;
	}
	public static void main(String ar[])
	{
		check n = new check();
		System.out.println("Multipli cation of 2,3 is: "+n.mul(2,3.5f));	
	}
}



