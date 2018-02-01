class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return (x*y);
	}
}
class Circle implements Area
{
	public float compute(float x,float y)
	{
		return (pi*x*x);
	}
}
class MAth
{
	public static void main(String ar[])
	{
	Rectangle rect=new Rectangle();
	Circle cir=new Circle();
	Area area;
	area=rect;
	System.out.println("Area of Rectangle is "+rect.compute(10,20));
	area=cir;
	System.out.println("Area of Circle is "+cir.compute(10,20));
	}
}