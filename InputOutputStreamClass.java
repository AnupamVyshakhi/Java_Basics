package anupam.java;
import java.io.*;
public class InputOutputStreamClass {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		System.out.println("Enter the string");
		String s=b.readLine();
        System.out.println("MY NAME IS "+s);
	}

}
