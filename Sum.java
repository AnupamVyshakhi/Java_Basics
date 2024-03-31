package anupam.java;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
      int i,n,sum=0;
      System.out.println("Enter the size\n");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements\n");
      for(i=0;i<n;i++)
      {
    	a[i]=sc.nextInt();  
      }
      for(i=0;i<n;i++)
      {
    	sum=sum+a[i];  
      }
      System.out.println("THE SUM  IS :"+sum);
	}

}
