package JavaSessions;

public class publicStaticVoidMainConcept {

	public static void main(String[] args) {
		
		
		//Every word in the public static void main statement has got a meaning to the JVM.
		
		/*Public : It is an Access modifier, which specifies from where and who can access method 
		           Making main method Public makes it globally available.It is made public as JVM 
		           can invoke it from outside if it is not present in current class.
		           
		 Error: Main method not found in class, please define the main method as:
                public static void main(String[] args)
                or a JavaFX application class must extend javafx.application.Application
        */
		
		/*Static : It is a keyword associated with a method , makes it a class related method.
		The main method is Static so that JVM can invoke it without instantiating the class.
		This also saves the unnecessary wastage of memory
		
		 Error: Main method is not static in class test, please define the main method as:
               public static void main(String[] args)
         */
		
		/* Void :It a keyword and is used to specify that method dosen't return anything
		    As main method dosen't return anything , its return type is Void .
		    As soon as the main() method terminates , the java program terminates too.
		    Hence, it dosen't make any sense to return from main() method as JVM can't do
		     anything with return value of it. 
		     
		  Error: Main method not found in class, please define the main method as:
                    public static void main(String[] args)
                     or a JavaFX application class must extend javafx.application.Application
          */
		
		/* Main : It is the name of java main Method.class It is the identifier that JVM looks for as the 
            starting of main method . It's not keyword
		
		Error: Main method not found in class, please define the main method as:
               public static void main(String[] args)
               or a JavaFX application class must extend javafx.application.Application
	     */
			
		
		/* String [] args : It stores java command line arguments and is array of type java.lang.String class
			  Here , the name of array is args but it is not fixed and user can use any other name in place of it. 
	    */
			
		
	}

}
