package exmref;
class A extends Thread
{
	public void run()
	{
	int i;
	for(i=1;i<100;i++)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
	}
}
}
class B extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<100;i++)
		{
			if(i%2==1)
			{
			 System.out.print(i+" ");
			}
		}
	}
}
public class Multhreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.start();
		try {
			a.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		B b=new B();
		b.start();
	}

}
