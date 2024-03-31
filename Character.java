package anupam.java;
import java.util.Scanner;
public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,l=0,flag=1;
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("enter the string");
		str=sc.nextLine();
		System.out.println("enter the character to be searched");
		char ch=sc.nextLine().charAt(0);
		l=str.length();
	    for(i=0;i<l;i++)
		{
	    	if(str.charAt(i)==ch)
			{
				flag=0;
			
			}
		}
		if(flag==0)
			System.out.println("present");
		else
			System.out.println("not present");
	}

}
