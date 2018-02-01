class Method{
	Method(){
		this(2);
		System.out.println("non paremeterized");
	}
	Method(int a){
		this(2,3);
		System.out.println("int a");
	}
	Method(int a, int b){
		System.out.println("int a, int b");
	}
	public static void main(String[] args) {
		Method m0 = new Method();
	}
}