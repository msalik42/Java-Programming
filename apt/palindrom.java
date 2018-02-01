class palindrom
{
	public static void main(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int x = Integer.parseInt(a[i]);
			int y=x,rev=0;
			while(y!=0)
			{
				int rem=y%10;
				rev = rev*10+rem;
				y=y/10;
			}
			{
				if(x==rev)
					System.out.println((i+1)+ ". value palindrom");
			}
		}
	}
}