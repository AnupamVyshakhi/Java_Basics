package exmref;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
		 if(num%i==0)
			 System.out.println(i);
		}
	}

}
