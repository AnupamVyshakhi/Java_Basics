package exmref;
import java.io.*;
public class FileHan {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("newfile");
		int i=1,ch;
		System.out.print(i+" ");
		while((ch=f.read())!=-1)
		{
			System.out.print((char)ch);
			if(ch=='\n')
			{
	         System.out.println(++i+": ");			
			}
		}
		f.close();
	}

}
