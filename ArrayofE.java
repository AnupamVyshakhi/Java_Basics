package exmref;
import java.util.*;
class Employee
{   Scanner sc=new Scanner(System.in);
	String name;
	int emp_id;
	long phn;
	void read()
	{
	 System.out.println("ENNTER THE NAME");
	 name=sc.nextLine();
	 System.out.println("ENTER THE EMP ID");
	 emp_id=sc.nextInt();
	 System.out.println("ENTER THE PHONE NUMBER");
	 phn=sc.nextLong();
	}
	void display()
	{
		System.out.println("NAME : "+name);
		System.out.println("EMP ID : "+emp_id);
		System.out.println("PHONE NO : "+phn);
	}
}
public class ArrayofE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Employee e[]=new Employee[5];
		for(i=0;i<5;i++)
		{
			e[i]=new Employee();
		}
		for(i=0;i<5;i++)
		{
			e[i].read();
		}
		for(i=0;i<5;i++)
		{
		  e[i].display();	
		}
	}

}
