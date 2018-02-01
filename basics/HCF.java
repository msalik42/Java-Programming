class HCF
{
	public static void main(String ar[])
	{
		int a=8,b=8,c=12,lcm=0,min;
		if(a<=b&&a<=c)
			min=a;
		else if(b<=c)
			min=b;
		else
			min=c;
		System.out.println("MIN is : "+min);
		for(lcm=min;lcm>0;lcm--)
			if(a%lcm==0&&b%lcm==0&&c%lcm==0)
			break;
		System.out.println("LCM is : "+lcm);
		
	}
}