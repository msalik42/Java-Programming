import java.io.*;
class Drive{
	public static void main(String[] args) {
		File f[] =File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			String path = f[i].getPath();
			System.out.println(path);
		}
	}
}