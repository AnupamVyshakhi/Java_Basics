package anupam.java;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=0,i=0,flag=0;
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter the string");
		str=sc.nextLine();
		l=str.length();
		while(i<l)
		{
			if(str.charAt(i)!=str.charAt(l-1))
			{
				flag=1;
				break;
			}
			i++;
			l--;
		}
		if(flag==1)
		{
			System.out.println("the string is not palindrome");
		}
		else
		{
			System.out.println("the string is palindrome");
		}
		
	}

}
