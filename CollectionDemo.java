package anupam.java;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println(numbers);
		System.out.println(numbers.get(2));
		System.out.println(numbers.remove(4));
		System.out.println(numbers);
		System.out.println(numbers.indexOf(3));
	}

}
