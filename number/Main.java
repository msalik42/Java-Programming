import num.opr.Number;
class Main
{
	public static void main(String ar[])
	{
		int a=1,b=1,c=1;
		int len = ar.length;
		switch(len)
		{
		case 0:
			break;
		case 1:
			a = Integer.parseInt(ar[0]);
			break;
		case 2:
			a = Integer.parseInt(ar[0]);
			b = Integer.parseInt(ar[1]);
			break;
		case 3:
			 a = Integer.parseInt(ar[0]);
			 b = Integer.parseInt(ar[1]);
			 c = Integer.parseInt(ar[2]);
			 break;
		}
		num.opr.Number n = new num.opr.Number();
		n.findHcf(a,b,c);
		n.findLcm(a,b,c);

	}
}