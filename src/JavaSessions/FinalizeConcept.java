package JavaSessions;

public class FinalizeConcept {
	
	
	public void Finalize() {
		System.out.println( " This is Finalize method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FinalizeConcept obj1= new FinalizeConcept();
		FinalizeConcept obj2= new FinalizeConcept();
		
		obj1=null;
		obj2=null;
		
		
		//Manually also we can call garbage Collector
		


	}

}
