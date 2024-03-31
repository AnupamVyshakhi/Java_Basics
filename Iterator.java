package anupam.java;
import java.util.*;
public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("Anupam");
		list.add("Goutham");
		list.add("Aninditha");
		list.add("Melvin");
		System.out.println("The names are:");
		System.out.println(list);
		java.util.Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
