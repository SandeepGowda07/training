package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class List {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Sandeep");
		name.add("Ram");
		name.add("Kalyan");
		name.add("Bob");
		Iterator<String> it = name.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println();
		System.out.println();
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Sandeep");
		map.put(2,"Ram");
		map.put(3,"Kalyan");
		map.put(4,"Bob");
		map.put(3,"Sachin");//when duplicate key is passed it override the previous value 
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
			
		}
	}

}
