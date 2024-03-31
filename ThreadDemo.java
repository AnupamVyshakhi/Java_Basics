package anupam.java;

public class ThreadDemo extends Thread {
	String name;
	ThreadDemo(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{
			System.out.println("Thread "+name+" running");
		for(int i=1;i<=10;i++)
		{
		System.out.println("Thread is running");
		System.out.println("Thread "+name+" with i "+i+" element in the thread is running");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t=new ThreadDemo("1");
		ThreadDemo t1=new ThreadDemo("2");
		t.start();
		t1.start();
	}

}
