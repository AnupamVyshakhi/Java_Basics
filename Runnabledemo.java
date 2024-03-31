package anupam.java;

public class Runnabledemo implements Runnable {
	String name;
	Runnabledemo(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{
			System.out.println("Thread "+name+" running");
		for(int i=1;i<=5;i++)
		{
		System.out.println("Thread "+name+" with i "+i+" element in the thread is running");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnabledemo t=new Runnabledemo("1");
		Thread obj=new Thread(t);
		obj.start();
		obj.join();
		Runnabledemo t1=new Runnabledemo("2");
		Thread obj1=new Thread(t1);
		obj1.start();
		obj1.join();
		Runnabledemo t2=new Runnabledemo("3");
		Thread obj2=new Thread(t2);
	    obj2.start();
	    System.out.println(obj.isAlive());
	}

}
