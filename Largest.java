package anupam.java;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,k,r,c;
		System.out.println("Enter the rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
				
		}
		int max=a[0][0];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
			  if(a[i][j]>max)
			  {
				  max=a[i][j];
			  }
			}
				
		}
		System.out.println("Largest is "+max);
	}

}
