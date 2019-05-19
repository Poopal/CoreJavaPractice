package Collection;

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		StringBuffer str2 = new StringBuffer();
		
		str2.append(str);
		
		str2= str2.reverse();        // used string builder to reverse
		
		System.out.println(str2);
		
	}

}
