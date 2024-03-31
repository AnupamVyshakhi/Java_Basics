package exmref;
import java.util.*;
class Shape
{
	int length,breadth;
	double radius;
	void area(int l,int b)
	{
		length=l;
		breadth=b;
		int area=length*breadth;
		System.out.println("THE AREA OF THE RECTANGLE IS : "+area);
	}
	void area(double r)
	{
		radius=r;
		double area=3.14*radius*radius;
		System.out.println("THE AREA OF THE CIRCLE IS "+area);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b,r;
		Scanner sc=new Scanner(System.in);
		Shape s=new Shape();
		System.out.println("Enter the length and breadth of the rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the radius of the circle");
		r=sc.nextInt();
		s.area(l,b);
		s.area(r);
		
	}

}
