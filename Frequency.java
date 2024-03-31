package anupam.java;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		String s=new String();
		System.out.println("enter the string");
		s=sc.nextLine();
		System.out.println("enter the character to be checked");
		char ch=sc.nextLine().charAt(0);
		int l=s.length();
		for(i=0;i<l;i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("the frequency of the character is "+count);
	}

}
