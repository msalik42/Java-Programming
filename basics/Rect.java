class Rectangle
{
	int length,width;
	public void getdata(int x,int y)
	{
		length=x;
		width=y;
	}
	int rectarea()
	{
		int area=length*width;
		return (area);
	}
}
class Rect
{
	public static void main(String ar[])
	{
	int area1;
	Rectangle rect1=new Rectangle();
	rect1.getdata(10,20);
	area1=rect1.rectarea();
	System.out.println("Area of rectangle="+area1);
	}
}