import java.util.Scanner;
class scan
{
	void square(Double a)
	{
		System.out.println(a*a);
	}
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();
		scan s = new scan();
		s.square(a);
	}
}