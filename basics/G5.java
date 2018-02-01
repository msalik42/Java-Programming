import java.io.*;
public class G5
{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args)throws IOException
    {
        System.out.print("Enter 1st Number :");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter 2nd Number :");
        int num2 = Integer.parseInt(br.readLine());

		int num3=num1+num2;
		System.out.println("Sum= "+num3);

    }
}