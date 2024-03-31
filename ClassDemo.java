package anupam.java;
class College
{
	final String s="SJCET";
}
class Department extends College
{
	String dpt="CSE";
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      College c=new College();
      System.out.println(c.s);
      Department d=new Department();
      System.out.println(d.dpt);
      System.out.println(d.s);
	}

}
