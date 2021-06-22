package FunctionalInterface;

//Functional Interface- Interface with Single Abstract Method(SAM) and any no.of Default and static methods
@FunctionalInterface //Annotation is Optional, If we specify the annotation, It will give error if more than 1 abstract method is present.
public interface FIDemo 
{
	void m1();
	//void m2();  //Error- Multiple non-overriding abstract methods found
	default void m3()
	{
		System.out.println("Default Method3");
	}
	
	default void m4()
	{
		System.out.println("Default Method4");
	}
	
	static void m5()
	{
		System.out.println("Static Method5");
	}
	
	static void m6()
	{
		System.out.println("Static Method6");
	}
	
}
