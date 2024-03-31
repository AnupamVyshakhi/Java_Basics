package anupam.java;
import java.util.Scanner;
class Area1
{
	int length,breadth;
	float radius;
	int base,height;
	
	void circle(float r)
	{
		radius=r;
		double area=3.14*radius*radius;
		System.out.println("area of circle is "+area);
	}
	void rectangle(int l,int b)
	{
		length=l;
		breadth=b;
		int area=length*breadth;
		System.out.println("the area of rectangle is "+area);
		
	}
	void triangle(int b,int h)
	{
		base=b;
		height=h;
		int area=(base*height)/2;
		System.out.println("the area of triangle is "+area);
				
	}
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area1 a=new Area1();
		Scanner sc=new Scanner(System.in);
		int l,b,r,h,ba;
		System.out.println("enter the length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter the radius");
		r=sc.nextInt();
		System.out.println("enter the base and height");
		ba=sc.nextInt();
		h=sc.nextInt();
		a.circle(r);
		a.rectangle(l,b);
		a.triangle(ba, h);
	}

}
