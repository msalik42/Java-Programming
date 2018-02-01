import java.util.Scanner;
import java.io.File;
class File1{
	public static void main(String[] args)throws Exception {
		File f = new File("D:/java/scan.java");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
		String txt = sc.nextLine();
		System.out.println(txt);	
		}
	}
}