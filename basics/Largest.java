class Largest
{
	public static void main(String[] args)
	{
	int i,lc;
	int arr[]=new int[]{1,5,7,12,15,19,2,3};
	lc=arr[0];
	for(i=0;i<8;i++)
	{
		if(arr[i]>lc)
		lc=arr[i];
	}
	System.out.println("Largest Number is = "+lc);
	}
}