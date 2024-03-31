package anupam.java;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread A, i= "+i);
		}
		System.out.println("Exits from thread A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread B, i= "+i);
		}
		System.out.println("Exits from thread B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread C, i= "+i);
		}
		System.out.println("Exits from thread C");
	}
}
public class NewThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		C c=new C();
	    c.setPriority(Thread.MAX_PRIORITY);
	    b.setPriority(Thread.NORM_PRIORITY);
	    a.setPriority(Thread.MIN_PRIORITY);
	    System.out.println("Thread A starts");
	    a.start();
	    System.out.println("Thread B starts");
	    b.start();
	    System.out.println("Thread C starts");
	    c.start();
		
	}

}
