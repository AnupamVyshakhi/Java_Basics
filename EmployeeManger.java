package exmref;
import java.util.*;
class Employeee
{
	String name;
	int age;
	String phn;
	int sal;
	String add;
	void printSalary(int sal)
	{
		this.sal=sal;
		System.out.println("THE SALARY OF THE EMPLOYEE IS :"+sal);
	}
}
class Officer extends Employeee
{
 String spe;
 void print()
 {
	 System.out.println("NAME : "+name);
	 System.out.println("AGE : "+age);
	 System.out.println("PHONE NO : "+phn);
	 System.out.println("SALARY : "+sal);
	 System.out.println("ADDRESS : "+add);
 }
}
class Manager extends Employeee
{
	String dpt;
	void print()
	 {
		 System.out.println("NAME : "+name);
		 System.out.println("AGE : "+age);
		 System.out.println("PHONE NO : "+phn);
		 System.out.println("SALARY : "+sal);
		 System.out.println("ADDRESS : "+add);
	 }
}
public class EmployeeManger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Officer o=new Officer();
		Manager m=new Manager();
		o.name="Anupam";
		o.age=19;
		o.phn="8139034254";
		o.sal=5000000;
		o.add="Wells Streat, Melbone";
		m.name="Melvin";
		m.age=19;
		m.phn="9778058217";
		o.sal=5000000;
		o.add="Wells Streat, Melbone";
		o.print();
		m.print();
		
		
	}

}
