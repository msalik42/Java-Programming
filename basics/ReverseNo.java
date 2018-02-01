class ReverseNo
{
	public static void main(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int num=Integer.parseInt(a[i]);
			int rev = 0;
			while(num!=0)
			{
				int rem = num%10;
				rev = rev*10 + rem;
				num = num/10;
			}
			
		System.out.println(rev);
		}
	}
}