import java.util.Scanner;
import java.io.File;
class read_file
{
	public static void main(String ar[])
	{
		File f = new File('D:\SALIK\WORK OUT\bootstrap.txt');
		Scanner sc = new Scanner(f);
		String file = sc.nextLine();
		System.out.println(file);
	}
}