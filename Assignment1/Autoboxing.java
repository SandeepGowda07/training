package example;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

	public static void main(String[] args) {
		Character c= 'A';
		List<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		for (Integer x : i) {
			System.out.println(x);
		}
		System.out.println(c);
	}

}
