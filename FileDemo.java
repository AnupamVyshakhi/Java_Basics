package anupam.java;
import java.io.*;
import java.util.*;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File obj=new File("sample.txt");
			if(obj.exists())
			{
				System.out.println("The file "+obj.getName()+" exists");
			}
			else
			{
				obj.createNewFile();
				System.out.println("file"+obj.getName()+"is created");
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the details into the file");
			String str=sc.nextLine();
			FileWriter w=new FileWriter(obj);
			w.write(str);
			System.out.println("data entered!!");
			w.close();
			File obj1=new File("New-Sample.txt");
			if(obj1.exists())
			{
				System.out.println("The file "+obj1.getName()+" exists");
			}
			else
			{
				obj.createNewFile();
				System.out.println("file"+obj1.getName()+"is created");
			}
			FileReader r=new FileReader(obj);
			BufferedReader br1=new BufferedReader(r);
			String g;
			System.out.println("THE DATA IS");
			while((g=br1.readLine())!=null)
			{
				System.out.println(g);
			}
			r.close();
			FileWriter w1=new FileWriter(obj1);
			w1.write(g);
			w1.close();
			System.out.println("data copied");
			FileReader r1=new FileReader(obj1);
			BufferedReader br=new BufferedReader(r1);
			String s;
			System.out.println("THE DATA IS");
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
			}
			r1.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
