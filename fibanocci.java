package exmref;
import java.util.*;
public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=0,i;
		int n;
		System.out.println("Enter the limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}

}
