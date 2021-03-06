package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Poonam", "Tech Mahindra");
		map.put("Nisha", "Infosys");
		map.put("Sandesh", "Nagarro");
		map.put("Kushboo", "Emids");
		
		System.out.println(map);
		
		//Convert HashMap keys into ArrayList
		
		Set<String> keyset = map.keySet();
		
		ArrayList<String> listOfKeys = new ArrayList<String>(keyset);
		
		System.out.println(listOfKeys);
		
		
		//Convert HashMap values into ArrayList
		
		Collection<String>  Values = map.values();
		
		
		ArrayList<String> listOfValues = new ArrayList<String>(Values);
		
		System.out.println(listOfValues);
		
		
		//Convert HashMap Key- value pair into ArrayList
		
		Set<Entry<String, String>> entryset= map.entrySet();
		
		ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String, String>>(entryset);
		System.out.println(listOfEntry);
		
		
		//How to get synchronized HashMap in java
		
		 Map<String,String> syncMap= Collections.synchronizedMap(map);
		 
		 System.out.println(syncMap);
		
	}
	
	

}
