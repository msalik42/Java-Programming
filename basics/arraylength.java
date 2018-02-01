class arraylength
{
	public static void main(String args[])
	{
	int sum=0;
	int sa[]={2,3};
	int len=sa.length;
	for(int i=0;i<len;i++)
		{
		sum=sum+sa[i];
		}
	sum=sum/len;
	System.out.println(+sum);
	}
}