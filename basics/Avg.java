class Avg
{
	public static void main(String ar[])
	{
		int avg=0; 
		int arr[]=new int[5];
		arr[0]=15;
		arr[1]=45;
		arr[2]=44;
		arr[3]=56;
		arr[4]=34;
		for(int i=0;i<5;i++)
		{
		avg=avg+arr[i];
		}
		avg=avg/5;
		System.out.println("Average of five numbers is "+avg);
	}
}