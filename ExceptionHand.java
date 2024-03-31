package exmref;

public class ExceptionHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b=5,c=0;
		try
		{
			int d=b/c;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		try
		{
			int f=b/a[3];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
