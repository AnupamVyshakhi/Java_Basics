package exmref;
import java.util.*;
public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");;
		String a=sc.nextLine();
		System.out.println("Enter the Character to be searched");
		char c=sc.nextLine().charAt(0);
		int l=a.length();
		for(i=0;i<l;i++)
		{
			if(a.charAt(i)==c)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println(c+" present at "+(i+1));
		}
		else
		{
			System.out.println("Not present");
		}

	}
}
