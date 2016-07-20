package test;


 

class Base 
{
	static {
		System.out.println("Base static block!");
		}
		
	{
		System.out.println("Base block!");
	
	}
	public Base()
	{
		System.out.println("Base coustructor!");
	}
}


public class Derived extends Base
{
	static {
		System.out.println("Derived static block!");
		}
		
	{
		System.out.println("Derived block!");	
	}
	public Derived()
	{
		System.out.println("Derived coustructor!");
	}
	public static final void main(String[]args)
	{
		new Derived();
	}

}