package anupam.java;
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		try
		{
		char c=s.charAt(25);
		System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			double pi=3.14;
			System.out.println(pi);
		}
		try
		{
			int num=Integer.parseInt(s);
			System.out.println(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception generated");
		}
		System.out.println("My name is Anupam");
		try
		{
			String a=null;
			System.out.println(a.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		try
		{
			int a[]=new int[5];
			a[7]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		 	System.out.println(e);
		}*/
		try
		{
			int a[]=new int[10];
			a[10]=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		 	System.out.println(e);
		}
		catch(Throwable e)
		{
		System.out.println(e);	
		}
	}

}
