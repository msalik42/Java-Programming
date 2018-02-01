import java . io . DataInputStream;
class value
{
	public static void main(String args[])
	{
		DataInputStream sa = new DataInputStream(System.in);
		int num1=0;
		float num2=0;
		try{
			System.out.println("Enter the integer value");
			num1=Integer.parseInt(sa.readLine());
		}
		catch (Exception e) { }
					System.out.println(+num1);
	}
}