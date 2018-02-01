import java . io . DataInputStream;
class ifelse
{
	public static void main(String args[])
	{
	int a;
	DataInputStream in = new DataInputStream(System.in);
	try
	{
		System.out.println("Enter a number: ");
		a=Integer.parseInt(in.readLine());
		if(n==1)
		{
		System.out.println("one");
		}
		else
		{
		System.out.println("not one");
		}	
	}
	catch(Exception e) {}
	}
}