package exmref;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the limit");
		n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
			 if(a[j]>a[j+1])
			 {
				 int temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
			}
		}
		System.out.println("The second largest elemet is "+a[n-2]);
		
	}

}
