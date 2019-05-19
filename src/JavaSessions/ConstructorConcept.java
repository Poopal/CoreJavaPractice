package JavaSessions;

public class ConstructorConcept {

	public ConstructorConcept() {
	System.out.println("Zero-Argument Constructor");
	System.out.println();
	}
	
	public ConstructorConcept(String s) {
	System.out.println("Single Argument Constructor");	
	System.out.println(s);
	}

	public  ConstructorConcept(int a, int b) {
		System.out.println("Two Argument Constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept obj1= new ConstructorConcept();
		ConstructorConcept obj2 = new ConstructorConcept("Sandesh"); 
		ConstructorConcept obj3= new ConstructorConcept(20, 29);
	}

}




/*
   1. Every class has a constructor whether it’s a normal class or a abstract class.
   2. Constructors are not methods and they don’t have any return type.
   3. Constructor name should match with class name .
   4  Constructor can use any access specifier, they can be declared as private also.
     Private constructors are possible in java but there scope is within the class only.
   5  Like constructors method can also have name same as class name, but still they have return type, 
     though which we can identify them that they are methods not constructors.
   6  If you don’t implement any constructor within the class, compiler will do it for.
   7 this() and super() should be the first statement in the constructor code. 
      If you don’t mention them, compiler does it for you accordingly.
   8  Constructor overloading is possible but overriding is not possible.
      Which means we can have overloaded constructor in our class but we can’t override a constructor.
   9  Constructors can not be inherited.
  10  If Super class doesn’t have a no-arg(default) constructor then compiler would not insert a default constructor
      in child class as it does in normal scenario.
  11  Interfaces do not have constructors.
  12  Abstract class can have constructor and it gets invoked when a class, which implements interface, is instantiated. 
        (i.e. object creation of concrete class).
  13  A constructor can also invoke another constructor of the same class – By using this().     
      If you want to invoke a parameterized constructor then do it like this: this(parameter list).


   Difference between Constructor and Method :-->

  1  The purpose of constructor is to initialize the object of a class while the purpose of a method is to perform a task by executing java code.
  2  Constructors cannot be abstract, final, static and synchronised while methods can be.
  3  Constructors do not have return types while methods do.
*/