import java.io.*;
class Drive
{
	public static void main(String ar[])
	{
		File f[] =File.listRoots();
		int len=f.length;
		for(int i=0;i<f.length;i++)
		{
			String path = f[i].getPath();
			System.out.println(path);
		}
		while(true)
		{
		File f2[] =File.listRoots();
			if(len<f2.length)
				{
				System.out.println(f2[f2.length-1]+"  :Is inserted");
				break;
				}
			if(len>f2.length)
				{
				System.out.println(f2[f2.length-1]+" Ejected");
				break;
				}
				
		}
	}
}