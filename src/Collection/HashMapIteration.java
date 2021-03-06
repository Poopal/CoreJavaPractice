package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(01, "Sandesh");
		map.put(02, "Poonam");
		map.put(03, "Chintu");

		System.out.println(map.size());

		Iterator itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println(" Key is " + me.getKey() + " "+ " Value is " + me.getValue());
		}

		System.out.println("*******For Each Loop***********");
		
		for( Map.Entry me2 : map.entrySet())
			
		{
			System.out.println(" Key is " + me2.getKey() + " "+ " Value is " + me2.getValue());
		}
	}

}
