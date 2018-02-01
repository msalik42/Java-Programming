class Multiplication implements MathOperations
{
	public float compute(float x,float y)
	{
		return x*y;
	}
}
class Divide implements MathOperations
{
	public float compute(float  x,float y)
	{
		return x/y;
	}
}
class Sum implements MathOperations
{
	public float compute(float x,float y)
	{
		return x+y;
	}
}
class Substraction implements MathOperations
{
	public float compute(float x,float y)
	{
		return x-y;
	}
}
class MathCalculation
{
	public static void main(String ar[])
	{
		Multiplication multi=new Multiplication();
		Divide divi=new Divide();
		Sum sum1=new Sum();
		Substraction subs=new Substraction();
		MathOperations opr;
		opr=multi;
		System.out.println("Multiplication	= "+opr.compute(10,3));
		opr=divi;
		System.out.println("Dividation 	= "+opr.compute(10,3));
		opr=sum1;
		System.out.println("Sumation	= "+opr.compute(10,3));
		opr=subs;
		System.out.println("Substraction	= "+opr.compute(10,3));
		
	}
	
}