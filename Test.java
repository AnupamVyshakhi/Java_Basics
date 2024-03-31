package anupam.java;
import java.util.*;
class Employeenew
{	
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	long phn;
	String adr;
	void printSalary()
	{
		System.out.println("the salary of the employee is 100000000");
	}
}
class Officer extends Employeenew
{
	void read()
	{
		System.out.println("NAME");
		name=sc.next();
		System.out.println("AGE");
		age=sc.nextInt();
		System.out.println("PHN NUMBER");
		phn=sc.nextLong();
		System.out.println("ADDRESS");
		adr=sc.next();
		
	}
	void print()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phn);
		System.out.println(adr);
		System.out.println("the specialization is educator");
	}
}
class Manager extends Employeenew
{
	void read()
	{
		System.out.println("NAME");
		name=sc.next();
		System.out.println("AGE");
		age=sc.nextInt();
		System.out.println("PHN NUMBER");
		phn=sc.nextLong();
		System.out.println("ADDRESS");
		adr=sc.next();
		
	}
	void print()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phn);
		System.out.println(adr);
		System.out.println("the department is computer science");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Manager m=new Manager();
     Officer o=new Officer();
     m.read();
     o.read();
     m.print();
     o.print();
	}

}
