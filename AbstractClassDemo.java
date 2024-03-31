package anupam.java;
abstract class ShapeArea
{
	abstract void area();
}
class Ee extends ShapeArea
{
	void area()
	{
		int l=5,b=6;
		System.out.println("the area of rectangle is "+l*b);
	}
}
class Square extends ShapeArea
{
	void area()
	{
		int a=7;
		System.out.println("The area of square is "+a*a);
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ShapeArea r=new Ee();
      ShapeArea s=new Square();
      r.area();
      s.area();
	}

}
