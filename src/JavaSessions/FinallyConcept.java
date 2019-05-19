package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println(" inside Try Block ");
			int k = i / 0;
		}

		
		catch (Exception e) {
			System.out.println(" Inside Catch Block");
			System.out.println(" Divide by Zero Error");
		}

		finally{
			System.out.println("Inside Finally Block");
		}
	}
}


