package anupam.java;
class Outer
{
	int x=5;
	void test()
	{
		Inner in=new Inner();
		in.display();
	}
	class Inner
	{
		int y=10;
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
	  
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
	       out.test();
	}

}
