package FunctionalInterface;

@FunctionalInterface
public interface FIInheritance 
{
	void m1();
}

@FunctionalInterface
interface Child extends FIInheritance
{
	//Valid as m1 is also SAM of interface "Child".
}


@FunctionalInterface
interface A
{
	void m2();
}

@FunctionalInterface
interface B extends A
{
	void m2(); //Valid as we are overriding the m2 method specified in A within B
}

@FunctionalInterface
interface C
{
	void m3();
}

@FunctionalInterface
interface D extends C
{
	void m4(); //Invalid as D is functional interface and containing 2 Abstract Methods m3,m4
}
