class Polymorphism
{
	
		void add(int i,int j)
		{
			System.out.println("int int");
			System.out.println(i+j);
		}
		void add(int i,float j)
		{
			System.out.println("int float");
			System.out.println(i+j);
		}
		void add(int i,int j,int k)
		{
			System.out.println("int float");
			System.out.println(i+j+k);
		}
		void add(float j,int i)
		{
			System.out.println("int float");
			System.out.println(i+j);
		}
		void fn(int a)
		{
			System.out.println("Single parameter ");
		}
	public static void main(String ar[])
	{
		Polymorphism d1 = new Polymorphism();
		d1.add(2,3.5f);
	}
}