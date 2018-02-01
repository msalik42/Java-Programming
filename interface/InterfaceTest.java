class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return x*y;
	}
}
class Circle implements Area
{
	public float compute(float x,float y)
	{
		return pi*x*x;
	}
}
class InterfaceTest
{
	public static void main(String ar[])
	{
		Rectangle rect=new Rectangle();
		Circle cir=new Circle();
		Area area;
		area=rect;
		float a=area.compute(10,20);
		System.out.println("Area of Rectangle= "+a);
		area=cir;
		System.out.println("Area of Circle= "+area.compute(10,0));
	}
}