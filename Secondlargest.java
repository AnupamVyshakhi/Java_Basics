package anupam.java;
import java.util.Scanner;
public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,n,j,temp;
     Scanner sc=new Scanner(System.in);
     System.out.println("size\n");
     n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("elements\n");
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
    			 temp=a[j];
    			 a[j]=a[j+1];
    			 a[j+1]=temp;
    		 }
    	 }
     }
     System.out.println("The second largest element is "+a[n-2]);
	}

}
