package DefaultStaticMethodsInInterface;

public interface Java8Interface2 
{
	void method4();
	default void method2()
	{
		System.out.println("In Method2 Int2 default");
	}
	
	static void method3()
	{
		System.out.println("In Method3 Int2 static");
	}
}
