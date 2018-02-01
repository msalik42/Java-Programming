class Function{
	void fn(int a){
		System.out.println("single pass function ");
	}
	void fn(int a,int b){
		System.out.println("Double pass function ");
	}
	public static void main(String[] args) {
		Function f = new Function();
		f.fn(2);	
	}
}