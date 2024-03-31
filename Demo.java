package anupam.java;
interface one
{
	default void message()
	{
		System.out.println("Default Message");
	}
	static void msg()
	{
		System.out.println("Static message");
	}
	public void name(String s);
	
}
class Deemo implements one
{
	public void name(String s)
	{
		System.out.println("My name is "+s);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Deemo d=new Deemo();
     d.name("Anupam");
     d.message();
     one.msg();
	}

}
