class Wait{
	public static void main(String[] args) {
		try{
			for(int i = 100;i>0;i--){
			System.out.println("10100110010010000101000010100100001010010101110101001");
			Thread.sleep(100);
			System.out.println("10010100001001001010111101010001001010001001010101010");
			Thread.sleep(100);
		}
		}catch(InterruptedException e)
		{
			System.out.println("Main Thread Inturrupted ");
		}
	}
}