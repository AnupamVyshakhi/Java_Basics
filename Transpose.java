package anupam.java;
/*import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,r,c;
		System.out.println("row and cloumn");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Transpose");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}
		
	}

}*/
//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Table
{
void printtable(int n)
{
   synchronized(this)
   {
       for(int i=1;i<=10;i++)
       {
           System.out.println(n+"*"+i+" = "+n*i);
           try
           {
               Thread.sleep(5);
           }
           catch(InterruptedException e)
           {
               System.out.println(e);
           }
       }
   }
}
}
class AA1 extends Thread
{
 Table t;
 int n;
 AA1(Table t)
 {
   this.t=t;  
 }
 public void run()
 {
     t.printtable(n);
 }
}
class BB1 extends Thread
{
 Table t;
 int n;
 BB1(Table t)
 {
   this.t=t;  
 }
 public void run()
 {
     t.printtable(n);
 }
}
class CC1 extends Thread
{
 Table t;
 int n;
 CC1(Table t)
 {
   this.t=t;  
 }
 public void run()
 {
     t.printtable(n);
 }
}
class Transpose {
 public static void main(String[] args) {
     Table t=new Table();
     AA1 a=new AA1(t);
     BB1 b=new BB1(t);
     CC1 c=new CC1(t);
     a.n=10;
     b.n=15;
     c.n=20;
     a.start();
     b.start();
     c.start();
 }
}
