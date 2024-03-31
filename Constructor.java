package anupam.java;
import java.util.Scanner;
class Peri
{
	float r;
	int l,b;
	Peri(float r)
	{
		this.r=r;
		System.out.println("perimeter of circle is "+2*3.14*r);
	}
	Peri(int l,int b)
	{
		this.l=l;
		this.b=b;
		System.out.println("perimeter of rectangle is "+2*(l+b));
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int r,l,b;
		System.out.println("enter radius");
		r=sc.nextInt();
		System.out.println("enter the length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
		Peri p=new Peri(r);
		Peri p1=new Peri(l,b);
		
	}

}
