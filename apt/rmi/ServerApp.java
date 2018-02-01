import java.rmi.*;
import java.rmi.server.*;
class ServerApp extends UnicastRemoteObject{
	ServerApp()throws Exception{}

	public int add(int i,int j)throws Exception{
		return i+j;
	}
	public static void main(String[] args) {
		try{
		ServerApp ser = new ServerApp();
		Naming.rebind("Server",ser);
		System.out.println("Server Registerd");
	}catch(Exception e)
		{
		System.out.println(e);			
		}
	}
}