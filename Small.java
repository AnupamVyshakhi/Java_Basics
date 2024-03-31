package exmref;
import java.util.*;
public class Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the limit");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int small=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("The smallest element is "+small);
	}

}
