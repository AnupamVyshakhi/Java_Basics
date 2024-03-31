package anupam.java;
import java.util.*;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int i,n;
     System.out.println("Enter the size");
     n=sc.nextInt();
     int a[]=new int[n];     
     System.out.println("Elemets\n");
     for(i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     int min=a[0];
     for(i=0;i<n;i++)
     {
    	 if(a[i]<min)
    	 {
    		 min=a[i];
    	 }
     }
     System.out.println("the smallest element is "+min);
	}

}
