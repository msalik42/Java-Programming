import java.io.*;
class Directory
{
	public static void main(String ar[])
	{
		File f  = new File("d:/");
		String name[]=f.list();
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.print("\t"+name[i]);
			File f1 = new File("d:/"+name[i]);
			String app = "";
			if(f1.isHidden())
				app = app+"<Hidden>";
			if(f1.isDirectory())
				app = app+"<Directory>";
			else
				app = app+"<File>";
			System.out.println("\t\t\t\t"+app);
		}
	}
}