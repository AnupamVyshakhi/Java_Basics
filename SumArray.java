package exmref;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("Enter the limit");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum is "+sum);
	}

}
