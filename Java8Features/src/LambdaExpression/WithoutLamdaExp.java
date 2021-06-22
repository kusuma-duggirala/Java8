package LambdaExpression;

public class WithoutLamdaExp implements LamdaDemo 
{

	public static void main(String[] args) 
	{
		LamdaDemo le=new WithoutLamdaExp();
		le.show(5);
	}

	public void show(int i) 
	{
		System.out.println(i);
	}

}


