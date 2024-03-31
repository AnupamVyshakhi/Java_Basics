package anupam.java;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,k,r1,r2,c1,c2;
		System.out.println("row and cloumn of matrix 1");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("row and cloumn of matrix 2");
		r2=sc.nextInt();
		c2=sc.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		System.out.println("Elements");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements");
		int c[][]=new int[r1][c2];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(k=0;k<c1;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("The product is");
		System.out.println("Elements");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
