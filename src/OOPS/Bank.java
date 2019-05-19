package OOPS;

public abstract class Bank { //Abstract Class 
	
	//Hiding the implementation logic --Abstraction
	//Partial Abstraction
	//Abstract Class can have Abstract and non Abstract methods
	//Can not create object of Abstract Class
	
	public abstract void loan();    // Abstract Method --No method body
	
	public void credit() {
		
		System.out.println("Credit Amount");  // Non Abstract method
	}
		
	public void debit() {
		System.out.println("Debit Amount");  //Non Abstract method
	}
	
}

