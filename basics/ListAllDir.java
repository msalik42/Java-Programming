import java.io.*;
class ListAllDir
{
public static void main(String ar[]){
		File f  = new File("d:/");
		String name[]=f.list();
		for(int i=0; i<name.length; i++){
			System.out.println("\t"+name[i]);
		}
	}
}