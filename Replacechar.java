package anupam.java;
import java.util.Scanner;
public class Replacechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		String s=new String();
		String s1=new String();
		System.out.println("enter the string");
		s=sc.nextLine();
		System.out.println("enter the character to be replaced");
		char ch=sc.nextLine().charAt(0);
		System.out.println("enter the character to be added");
		char chn=sc.nextLine().charAt(0);
		int l=s.length();
		for(i=0;i<l;i++)
		{
			if(s.charAt(i)==ch)
			{
				s1=s.replace(ch, chn);
			}
		}
		System.out.println("the new string is "+s1);
		
		
	}

}
