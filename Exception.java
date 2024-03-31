package anupam.java;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0,s,se;
		int c[]= {1,2,3};
		try
		{
		  s=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("DIVISION BY ZERO");
		}
		try
		{
			se=a*c[3];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index is out of bound");
		}
		
	}

}
