import java.io.*;
class List
{
	void travarse(String path)
	{
		File file1 = new File(path);
		String names[] = file1.list();
		if(names!=null)
		{
			for(int i=0;i<=names.length;i++)
			{
				System.out.println(names[i]);
				File file2 =new File(path+"/"+names[i]);
				if(file2.isDirectory())
					travarse(file2.getPath());
			}
		}
	}	
	public static void main(String ar[])
	{
		List l = new List();
		l.travarse("D:/java/");
	}
}