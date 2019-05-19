package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementsFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> List1= new ArrayList<String>();
	         List1.add("Poonam");
	         List1.add("Sandesh");
	         List1.add("Nisha");
	         List1.add("Poonam");
	         List1.add("Sandesh");
	         List1.add("Chiku");
	         
	         System.out.println(List1);
	         
	       //Constructing LinkedHashSet using listWithDuplicateElements (List1)
	         
	         LinkedHashSet<String> List2 = new LinkedHashSet<String>(List1);
	         
	         //Constructing listWithoutDuplicateElements using set
	         
	         ArrayList<String> List3= new ArrayList<String>(List2);
	         
	         //Printing listWithoutDuplicateElements
	         
	         System.out.println(List3);
	         
	         //Similarly we can use HashSet as well to remove duplicates
	         
	         
	        	 
	}

}
