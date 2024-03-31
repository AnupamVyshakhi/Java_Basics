package exmref;
import java.util.*;
class Shapeee
{
	int length,breadth;
	double radius;
    Shapeee(int l,int b)
    {
    	length=l;
    	breadth=b;
    	int peri=2*(length+breadth);
    	System.out.println("THE PERIMETER OF THE RECTANGLE IS "+peri);
    }
    Shapeee(double r)
    {
    	radius=r;
    	double peri=2*3.14*radius;
    	System.out.println("THE PERIMETER OF THE CIRCLE IS "+peri);
    	
    }
}
public class ConstructorO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the radius of the circle");
		double r=sc.nextInt();
		Shapeee s=new Shapeee(l,b);
		Shapeee s2=new Shapeee(r);
	}

}
