import java.util.Scanner;
class main{
	public static void main(String[] args) {
			System.out.println("hi i am from main method ");
			package1.math.math math= new package1.math.math();
			package1.string.string string = new package1.string.string();

			System.out.print("Enter your name: ");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			string.hello(name);
			string.length(name);
	}
}
