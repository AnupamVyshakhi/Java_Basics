package anupam.java;
import java.util.*;
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int a=sc.nextInt();
		try
		{
			if(a<=12||a>60)
			{
				throw new AgeNotPossibleException("Age not possible");
				
			}
			else
			{
				System.out.println("Registration possible");
			}
		}
		catch(AgeNotPossibleException e)
		{
			System.out.println(e);
		}
	}

}
