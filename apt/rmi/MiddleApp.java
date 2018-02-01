import java.rmi.Remote;
public interface MiddleApp extends Remote
{
	public int add(int i, int j)throws Exception;
}