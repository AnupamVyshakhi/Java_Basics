package anupam.java;
interface Colleege
{
	public String clgname();
	
}
interface Depaartment
{
	public String deptname();
}
class Studeent implements Depaartment,Colleege
{
	 String cname,dname;
	 Studeent(String cname,String dname)
	 {
		 this.cname=cname;
		 this.dname=dname;
	 }
	public String clgname()
	{
	  return cname;	
	}
	public String deptname()
	{
		return dname;
	}
}
public class MultipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Studeent s=new Studeent("SJCET","CSE");
     System.out.println("college name is "+s.cname);
     System.out.println("Department name is "+s.dname);
	}

}
