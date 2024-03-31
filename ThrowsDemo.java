package anupam.java;
class Example
{
	static float divide(int a,int b)throws ArithmeticException
	 {
		return a/b;
	 }
	
}
public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(Example.divide(10, 5));
			System.out.println(Example.divide(10, 0));
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);	
		}
	}

}
