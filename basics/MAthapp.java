class Math{
	int a,b;
	static float mul(float x,float y)
	{
		return x*y;
		
	}
	static float div(float x,float y)
	{
		return x/y;
	}
}
class Mathapp
{
	public static void main(String ar[])
	{
		float a=Math.div(4,5);
		System.out.println(a);
	}
}