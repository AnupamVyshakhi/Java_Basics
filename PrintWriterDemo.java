package anupam.java;
import java.io.*;
public class PrintWriterDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter obj=new PrintWriter(System.out);
		obj.write("My Name is Anupam");
		obj.flush();
		obj.close();
	}

}
