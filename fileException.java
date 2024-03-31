package anupam.java;
import java.util.*;
import java.io.*;
public class fileException {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try
		{
			Scanner sc=new Scanner(System.in);
			File f=new File("Number.txt");
			if(f.exists())
			{
				System.out.println("file "+f.getName()+" exists");
			}
			else
			{
				f.createNewFile();
				System.out.println("file "+f.getName()+"created");
			}
			System.out.println("Enter the number of inputs");
			int n=sc.nextInt();
			System.out.println("Enter the numbers");
			FileOutputStream f1=new FileOutputStream(f);
			for(int i=0;i<n;i++)
			{
				int num=sc.nextInt();
				f1.write(num);
			}
			File o=new File("Odd.txt");
			File e=new File("Even.txt");
			if(f.exists())
			{
				System.out.println("file "+o.getName()+" exists");
			}
			else
			{
				o.createNewFile();
				System.out.println("file "+o.getName()+"created");
			}
			if(e.exists())
			{
				System.out.println("file "+e.getName()+" exists");
			}
			else
			{
			    e.createNewFile();
				System.out.println("file "+e.getName()+"created");
			}
			FileOutputStream f2=new FileOutputStream(o);
			FileOutputStream f3=new FileOutputStream(e);
			FileInputStream i=new FileInputStream(f);
			int x;
			System.out.println("Number in "+f.getName()+" are");
			while((x=i.read())!=-1)
			{
				System.out.println(x);
				if(x%2==0)
				{
					f3.write(x);
				}
				else
				{
					f2.write(x);
				}
			}
			FileInputStream f4=new FileInputStream(o);
			FileInputStream f5=new FileInputStream(e);
			System.out.println("The numbers in the file "+o.getName()+" are");
			while((x=f4.read())!=-1)
			{
				System.out.println(x);
			}
			System.out.println("The numbers in the file "+e.getName()+" are");
			while((x=f5.read())!=-1)
			{
				System.out.println(x);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
