import java.rmi.*;
import java.util.*;
class ClientApp{
	public static void main(String[] args) {
		try{
		System.out.println("Enter number a1: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter number a2: ");
		int y = sc.nextInt();
		MiddleApp app = (MiddleApp)Naming.lookup("rmi://192.168.198.1/server");
		int result = app.add(x,y);
		System.out.println(+result);
		}	catch(Exception e){
			System.out.println(e);	
			}
		
	}
}