package Collection;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {

		String s = "i am learning java program program";
	      String[] splitted = s.split(" ");
	      Map<String, Integer> hm = new HashMap<String, Integer>();

	      for (int i=0; i<splitted.length ; i++) {
	         if (hm.containsKey(splitted[i])) {
	            int cont = hm.get(splitted[i]);
	            hm.put(splitted[i], cont + 1);
	         } else {
	            hm.put(splitted[i], 1);
	         }
	      }
	      System.out.println(hm);
	   }
	}
