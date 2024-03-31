package anupam.java;
interface NewShapeArea
{
	 void sarea();
	 void carea();
}
class Squaure implements NewShapeArea
{
	
	public void sarea()
	{
		int a=10;
		System.out.println("The area of square is "+ a*a);
	}
	public void carea()
	{
		float a=10;
		System.out.println("The area of circle is "+3.14*a*a);
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Squaure s=new Squaure();
    s.carea();
    s.sarea();
	}

}
