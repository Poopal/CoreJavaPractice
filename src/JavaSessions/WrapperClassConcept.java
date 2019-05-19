package JavaSessions;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Objective of Wrapper Class is to
		//wrap Primitive datatypes into object form so that we can handle primitives also just like objects
		// To define several utility methods which are required for the Primitives
		
		String s = "1000";
		
		System.out.println(s+1000);
		
		
		//Data Conversion : String to Integer;
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
		
		//String to Double
		String y= "12.33";
	     double d= Double.parseDouble(y);
	     System.out.println(d);

	
	//String to Boolean
	     String z ="Poonam";
	     boolean b = Boolean.valueOf(z);
	     System.out.println(b);
	     
	     
	     // int to String Conversion
	     
	     int p = 678838;
	     System.out.println(p+20);
	     String n = String.valueOf(p);
	     System.out.println(n+20);
	     
	     
	     // String to 
	     // java.lang.NumberFormatException
	     String w= "100A";
	     int q= Integer.parseInt(w);
	     System.out.println(q);
	}

}
