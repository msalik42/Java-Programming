class NewThread implements Runnable{
	Thread T;
	NewThread(){
		T = new Thread(this,"Creating Thread");
		System.out.println("Thread of child: "+T);
		T.start();
	}
	public void run(){
		try{
			for(int j=10;j>6;j--){
				System.out.println("Child Thread: "+j);
				Thread.sleep(500);
				Thread th=Thread.currentThread();
				System.out.println("Child thead name is: "+th.getName());			}
		}catch(InterruptedException e)
		{
			System.out.println("Child inturupted");
		}
		System.out.println("Exiting child");
	}
}
class CreateThread
{
	public static void main(String[] args) {
		new NewThread();
		try{
			for(int k=10;k>6;k--){
				System.out.println("Parent Thread: "+k);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
				System.out.println("Parent Inturupted");
			}
		System.out.println("Exiting Parent");
	}
}