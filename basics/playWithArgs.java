class playWithArgs
{
	public static void main(String args[])
	{
		String string;
		System.out.println("i am ");
		int x=args.length;
		for(int i=0;i<x;i++)
		{
		string=args[i];
		System.out.println(string);
		}
		int z=x+2;
		int y=z+1;
		System.out.println("this is the "+z+" line of sop");
		System.out.println("and this is "+y +" line of sop");
	}
}