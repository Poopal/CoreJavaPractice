package OOPS;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Static Polymorphism or Compile time Polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.theftSafety();
		b.refuel();
		

		
		Car c =new Car();
		c.start();
		c.stop();
		c.refuel();
		
		
		//UpCasting/ TopCasting
		//Child class object can be referred by Parent class variable ---Dynamic Polymorphism / Run time Polymorphism
		Car c1 =new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//DownCasting 
		
		BMW b1 = (BMW)new Car(); //ClassCastException
					
	}

}

/* Polymorphism:
 * 
 * Polymorphism is the ability of an object to take on many forms. 
 * The most common use of polymorphism in OOPs occurs when a parent class reference is used to refer to a child class object. ... 
 * The reference variable can be reassigned to other objects provided that it is not declared final.
 */
	
	
