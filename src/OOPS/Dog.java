package OOPS;

public class Dog extends Animal {
	
	public void barks() {
		
		System.out.println("Dog Barks");
	}
	
	public void smells() {
		
		System.out.println("Dog Smells");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.drink();
		d.barks();
		d.eat();
		d.smells();

	}

}

/*Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
 * It is an important part of OOPs (Object Oriented programming system).
The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
This is also know as Is-A relationship
*/
