package anupam.java;
class Box
{
	double width,breadth,depth;
	Box(double w,double b,double d)
	{
		width=w;
		breadth=b;
		depth=d;
	}
	Box(Box z)
	{
		width=z.width;
		breadth=z.breadth;
		depth=z.depth;
		
	}
	double volume()
	{
		return(width*breadth*depth);
	}
	
}
public class ObjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Box b=new Box(10,20,30);
     
     System.out.println("The volume is "+b.volume());
     Box b1=new Box(b);
     System.out.println("The volume is "+b1.volume());
     
	}

}
