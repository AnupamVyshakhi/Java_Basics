package anupam.java;
import java.util.*;
class Eligibility
{
	void check(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("Below 18 not eligible for election");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
}
public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eligibility e=new Eligibility();
		e.check(16);
	}

}
