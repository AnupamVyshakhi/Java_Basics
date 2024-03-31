package exmref;
class Employeeeee
{
	void display()
	{
		System.out.println("THE NAME OF THE CLASS IS EMPLOYEE");
	}
	void calcSalary()
	{
		System.out.println("THE SALARY OF THE EMPLYEE IS 10000");
	}
}
class Engineer extends Employeeeee
{
	void calcSalary()
	{
		super.calcSalary();
		System.out.println("THE SALARY OF THE EMPLOYEE IS 20000");
	}
}
public class Salaryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer e=new Engineer();
		e.display();
		e.calcSalary();
	}

}
