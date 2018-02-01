package package1.math;
import java.util.Scanner;
public class math{
	public void add(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a: ");
		int a = sc.nextInt();
		System.out.print("Enter the number b: ");
		int b = sc.nextInt();
		System.out.println("Addition: " +(a+b));
	}
	public void mul(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a: ");
		int a = sc.nextInt();
		System.out.print("Enter the number b: ");
		int b = sc.nextInt();
		System.out.println();
	}
	public void div(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a: ");
		int a = sc.nextInt();
		System.out.print("Enter the number b: ");
		int b = sc.nextInt();
		System.out.println(a/b);
	}
}