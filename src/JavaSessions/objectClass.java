package JavaSessions;

public class objectClass {

	public static void main(String[] args) {
		
		
		/*Object class is present in java.lang package. Every class in Java is directly or indirectly derived
		  from the Object class. Therefore the Object class methods are available to all Java classes.
		  Hence Object class acts as a root of inheritance hierarchy in any Java Program.
		  
		  
		  toString() : toString() provides String representation of an Object and used to convert an object to String. 
		  The default toString() method for class Object returns a string consisting of the name of the class of which 
		  the object is an instance, the at-sign character `@’, and the unsigned hexadecimal representation of the
		   hash code of the object.

		   public String toString()
      {
          return getClass().getName() + "@" + Integer.toHexString(hashCode());
      } 
		    
		    
		    hashCode() : For every object, JVM generates a unique number which is hashcode.
		     It returns distinct integers for distinct objects. A common misconception about this method is that
		      hashCode() method returns the address of object, which is not correct.
		       It convert the internal address of object to an integer by using an algorithm. 
		    
		    Use of hashCode() method : Returns a hash value that is used to search object in a collection.
		     JVM(Java Virtual Machine) uses hashcode method while saving objects into hashing related data
		      structures like HashSet, HashMap, Hashtable etc.
		     The main advantage of saving objects based on hash code is that searching becomes easy.
		    
		    
		    
		    finalize() method : This method is called just before an object is garbage collected. 
		    It is called by the Garbage Collector on an object when garbage collector determines that
		     there are no more references to the object. We should override finalize() method 
		     to dispose system resources, perform clean-up activities and minimize memory leaks.
		     
		     Note :finalize method is called just once on an object even though that object is eligible
		      for garbage collection multiple times.
		    
		    
		    equals() : It is used to compare address of 2 objects .
		               It returns boolean value
		    
		    */
	}

}
