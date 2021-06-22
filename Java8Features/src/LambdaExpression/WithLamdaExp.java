package LambdaExpression;

//Applicable only for functional interface -interface that contains only one abstract method and any no.of default and static methods.
public class WithLamdaExp 
{
    //le* is the object of Consumer Interface
	public static void main(String[] args) 
	{
		LamdaDemo le1=new LamdaDemo() //Anonymous inner class
				{
					public void show(int i) 
					{
						System.out.println("Number is: "+i);
					}
				};
		le1.show(5);
		
		LamdaDemo le2=(int i) ->
			{
				System.out.println("Number is: "+i);
			}
		;
		le2.show(6);
		
		LamdaDemo le3=(int i) ->System.out.println("Number is: "+i);
		le3.show(7);
		
		LamdaDemo le4=i ->System.out.println("Number is: "+i);
		le4.show(8);

	}
}
