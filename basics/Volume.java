class Box
{
	int length,hight,width;
	Box (int x,int y,int z)
	{
		length=x;
		width=y;
		hight=z;
	}
	int boxVolume()
	{
		return(length*hight*width);
	}
}
class Volume
{
	public static void main(String arrgs[])
	{
	Box volume1 = new Box(10,20,30);
	int volume11 = volume1.boxVolume();
	System.out.println(+volume11);
	}
}