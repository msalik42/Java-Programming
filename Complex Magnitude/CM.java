import java.lang.Math;
class Complex
{
	double real;
	double im,y;
	double z;
	Complex(double x,double y)
	{
	real=x;
	im=y;
	}
	double magni()
	{
	y=real*real+im*im;
	z=Math.sqrt(y);
		return(z);
	}
}
class CM
{
	public static void main(String[] args)
	{
	Complex magn = new Complex(10,10);
	double magn1 = magn.magni();
	System.out.println(+magn1);
	}
}