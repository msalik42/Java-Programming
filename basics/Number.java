package num.opr;
public class Number
{	
	public void findHcf(int a, int b, int c)
	{
		int min, hcf;
		if(a<b&&a<c)
			min=a;
		else if(b<c)
			min = b;
		else
			min = c;
		for(hcf=min;hcf>=1;hcf--)
			if(a%hcf==0&&b%hcf==0&&c%hcf==0)
				break;
	
	System.out.println("HCF is : "+hcf);
	}
	public void findLcm(int a, int b, int c)
	{
		int max,lcm;
		if(a>b&&a>c)
			max=a;
		else if(b>c)
			max=b;
		else	
			max=c;
		for(lcm=max;lcm<=a*b*c;lcm++)
			if(lcm%a==0&&lcm%b==0&&lcm%c==0)
				break;
		System.out.println("LCM is : "+lcm);

	}
}