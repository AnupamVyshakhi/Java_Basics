package anupam.java;
import java.util.Random;
import java.util.Scanner;
class One extends Thread
{
	int limit;
	public void run()
	{
		
		for(int i=0;i<limit;i++)
		{
			Random r=new Random();
			int n=r.nextInt(100);
			if(n%2==0)
			{
				Two t=new Two(n);
				t.start();
			}
			else
			{
				Three th=new Three(n);
				th.start();
			}
		}
	}
}
class Two extends Thread
{
	int n;
	Two(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("The square of "+n+" is "+n*n);
	}
}
class Three extends Thread
{
	int n;
	Three(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("The cube of "+n+" is "+n*n*n);
	}
}
public class Trace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		One f=new One();
		System.out.println("Enter the number of times random number should be generated");
		f.limit=sc.nextInt();
		f.start();
}
}	
	
	
