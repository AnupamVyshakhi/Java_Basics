package anupam.java;
import java.util.*;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="My name is Anupam";
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.indexOf("Anupam"));
		System.out.println(s.lastIndexOf("Anupam"));
		StringBuffer b=new StringBuffer("Hey there ");
		System.out.println("Length is :"+b.length());
		System.out.println("Capacity is "+b.capacity());
		System.out.println(b.append("good morning"));
		System.out.println(b.reverse());
		System.out.println(b.deleteCharAt(5));
		System.out.println(b.delete(7, 11));
		System.out.println(b.reverse());
		System.out.println(b.replace(0, 4, "hello"));
		StringBuilder sb=new StringBuilder("Anupam");
		System.out.println(sb.append(" Vyshakhi"));
		System.out.println(sb.insert(0,"R u there"));*/
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			num=Integer.parseInt(s);
			sum=sum+num;
		}
		System.out.println("sum is "+sum);
	}

}
