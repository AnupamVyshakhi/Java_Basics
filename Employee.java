package anupam.java;
import java.util.*;
class Employee1
{
	Scanner sc=new Scanner(System.in);
	int empno;
	String name;
	long phn;
	void read()
	{
		System.out.println("NAME");
		name=sc.nextLine();
		System.out.println("EMPLOYEE NUMBER");
		empno=sc.nextInt();
		System.out.println("PHN NUMBER");
		phn=sc.nextLong();
	}
	void print()
	{
		System.out.println("NAME IS "+name);
		System.out.println("EMPLOYEE NUMBER IS "+empno);
		System.out.println("PHONE NUMBER IS "+phn);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee1 e[]=new Employee1[5];
      for(int i=0;i<5;i++)
      {
    	  e[i]=new Employee1();
      }
      for(int i=0;i<5;i++)
      {
    	  e[i].read();
      }
      for(int i=0;i<5;i++)
      {
    	  e[i].print();
      }
}

}
