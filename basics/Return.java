class Return
{
	static int method(int a){
		int f = 1;
		for(int i=1;i<=a;i++){
			f = i*f;
		}
		
		return f;
	}
	public static void main(String[] args){
		int b = Return.method(5);
		System.out.println("Factorial is : "+b);
	}
}