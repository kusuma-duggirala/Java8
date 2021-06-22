package DefaultStaticMethodsInInterface;

public interface Java8Interface1 
{
	void method1();
	default void method2()
	{
		System.out.println("In Method2 Int1 default");
	}
	
	static void method3()
	{
		System.out.println("In Method3 Int1 static");
	}
}
