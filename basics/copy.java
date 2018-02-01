import static java.nio.file.FileVisitResult.*;
class copy
{
		public static void main(String ar[])
		{
			try{
			FileInputStream from = new FileInputStream("A.java");
			FileInputStream to = new FileInputStream("hamari.java");
			byte []buffer = new byte[4096];
			int byteRead;
			while((byteRead = from.read(buffer))!=-1)
			{
				to.write(buffer,0,byteRead);
			}
			from.close();
			to.close();
			System.out.println("File copied");
			}
			catch(Exception ee)
			{
			
			}
		}
}