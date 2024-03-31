package anupam.java;
import java.util.*;
public class VectorClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> animal=new Vector<>();
		animal.add("DOG");
		animal.add("CAT");
		animal.add("TIGER");
		System.out.println("The vector elements"+animal);
		animal.add(2, "LION");
		System.out.println("The new vector elements"+animal);
		String a=animal.get(0);
		System.out.println("The element at 0th index is "+a);
		Iterator<String> iterate=animal.iterator();
		System.out.println("The vectors after iteration: ");
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
	   String b=animal.remove(2);
	   System.out.println("deleted is "+b);
	   System.out.println("The elements after deletion "+animal);
	   animal.clear();
	   System.out.println("The elements after deletion "+animal);
		}
	

}
