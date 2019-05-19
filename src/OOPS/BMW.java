package OOPS;

public class BMW extends Car { //" Is-a Relationship"--- Class to Class relationship ( Extends Keyword )
	
	
	//when same method is present in parent class as well as child class with same name and same number of arguments is called Method Overriding
	public void start()
	{
		System.out.println("BMW Starts");
	}
  public void theftSafety() 
  {
	  System.out.println("BMW theftSafety");
  }
}
