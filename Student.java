package anupam.java;
import java.util.Scanner;
class Student1
{
	Scanner sc=new Scanner(System.in);
	String name;
	int rn;
	int mark[];
	void read()
	{
		name=new String();
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the roll number");
		rn=sc.nextInt();
		System.out.println("Enter the marks of five sub");
		mark=new int[5];
		for(int i=0;i<5;i++)
		{
			mark[i]=sc.nextInt();
		}
		
	}
	void display()
	{
		System.out.println("NAME"+name);
		System.out.println("ROLL NO:"+rn);
		for(int i=0;i<5;i++)
		{
			System.out.println("mark"+mark[i]);
		}
	}
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student1 s=new Student1();
      s.read();
      s.display();
     
	}

}
