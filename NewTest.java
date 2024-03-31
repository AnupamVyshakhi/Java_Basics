package anupam.java;
abstract class Shape
{
	abstract void numberOfsides();

}
class Rectangle extends Shape
{
	void numberOfsides()
	{
		System.out.println("RECTANGLE HAS 4 SIDES");
	}
}
class Triangle extends Shape
{
	void numberOfsides()
	{
		System.out.println("TRIANGLE HAS 3 SIDES");
	}
}
class Hexagon extends Shape
{
	void numberOfsides()
	{
		System.out.println("HEXAGON HAS 6 SIDES");
	}
}
public class NewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape r=new Rectangle();
      Shape t=new Triangle();
      Shape h=new Hexagon();
      r.numberOfsides();
      t.numberOfsides();
      h.numberOfsides();
	}

}
