package session_4;

public class B extends A {
	public B()
	{
		//super();
		System.out.println("In default of B");
		
		
	}
	public B (int a)
	{
		super(100);
		System.out.println("In parameterized of B"+a);
		
	}
	public static void main(String[]args)
	{
		B b = new B(10);
	}

}
