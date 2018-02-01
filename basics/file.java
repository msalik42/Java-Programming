import java.io.File;
import java.util.Scanner;
class file
{
		public static void main(String ar[])
		{
			File f = new File("E:\salik\a.txt");
			Scanner sc = new Scanner(f);
			String content = sc.next();
			System.out.println(content);
		}
}