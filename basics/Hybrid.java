class Student
{
	int rollNumber;
	void getNumber(int x)
	{
		rollNumber=x;
	}
	void putNumber()
	{
		System.out.println("Roll No. :"+rollNumber);
	}
}
class Test extends Student
{
	float part1,part2;
	void getMarks(int m1,int m2)
	{
		part1=m1;
		part2=m2;
	}
	void putMarks()
	{
		System.out.println("Marks obtained");
		System.out.println("Part 1=: "+part1);
		System.out.println("Part 2=: "+part2);
	}
}
interface Sports
{
	float sportWt=6.0F;
	void putWt();
}
class Results extends Test implements Sports
{
	float total;
	public void putWt()
	{
		System.out.println("Sport Wt=: "+sportWt);
	}
	void display()
	{
		total=part1+part2+sportWt;
		putNumber();
		putMarks();
		putWt();
		System.out.println("Total score=: "+total);
	}
}
class Hybrid
{
	public static void main(String argd[])
	{
		Results student1=new Results();
		student1.getNumber(145);
		student1.getMarks(99,98);
		student1.display();
	}
}