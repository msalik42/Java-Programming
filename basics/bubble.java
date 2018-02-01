class bubble
{
	public static void main(String ar[])
	{
		int i,j,temp,a[]={1,3,2,6,5,3,8,6};
		for(i=0;i<a.length-1; i++)
		{
			for(j=0;j<=i;j++)
			{
				if( a[i] >= a[i+1])
				{
				temp =a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				}
			
			}
			System.out.println(a[i]);
		}
	}
}