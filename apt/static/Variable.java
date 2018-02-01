class Variable{
	static int a=10;
	static void fn(){
		System.out.println("Value of a is: "+a);
	}

	public static void main(String[] args) {
													// this program can be compile without main method but problem at run time 
													//(can not find main method)
	}
	static{
		Variable.fn();
	}
}