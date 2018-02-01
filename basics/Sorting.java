class Sorting
{
	public static void main(String ar[])
	{
		int arr[]={10,40,30,20,50};
		int n=arr.length;
		int temp;
		int i;
		System.out.println("Given list is ");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
			System.out.println("Sorted list is ");
		for(i=0;i<n;i++)
		{
			System.out.println(" "+arr[i]);
		}
		System.out.println("");
	}
}