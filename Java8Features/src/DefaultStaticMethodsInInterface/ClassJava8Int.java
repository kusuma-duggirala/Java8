package DefaultStaticMethodsInInterface;

public class ClassJava8Int implements Java8Interface1,Java8Interface2
{

	public static void main(String[] args) 
	{
		
		ClassJava8Int obj1=new ClassJava8Int();
		obj1.method1();			  //unimplemented method
		obj1.method4();           //unimplemented method
		obj1.method2();           //default method -- Need to define default method here to override it
		Java8Interface1.method3(); //static method --Interface specific, Multiple inheritence is not affected here
		Java8Interface2.method3(); //static method --Interface specific, Multiple inheritence is not affected here
	}
	

	public void method1() 
	{
		System.out.println("In unimplemented method1 from Int1");
	}
	
	public void method4() 
	{
		System.out.println("In unimplemented method4 from Int2");
		
	}

	/*@Override
	public void method2() {
		// TODO Auto-generated method stub
		Java8Interface1.super.method2(); //or
		Java8Interface2.super.method2();
	}*/
	
	public void method2()
	{
		System.out.println("In class method2");
	}

	
	
	

}
