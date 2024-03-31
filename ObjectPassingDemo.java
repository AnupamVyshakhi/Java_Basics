package anupam.java;
class Swapper1
{
	int a,b;
	Swapper1(int x,int y)
	{
		a=x;
		b=y;
		
	}
	void swap(Swapper1 swa)
	{
		int temp;
		temp=swa.a;
		swa.a=swa.b;
		swa.b=temp;
	}
}

public class ObjectPassingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Swapper1 s=new Swapper1(10,30);
      System.out.println("Before swapping value of a and b is "+s.a+","+s.b);
      s.swap(s);
      System.out.println("After swapping "+s.a+", "+s.b);
	}

}
