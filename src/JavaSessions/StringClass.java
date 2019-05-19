package JavaSessions;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String s = "jaVA";
		String s1= "JAva";
		String s2 = " Java selenium Course ";
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		String s3 = "Sandesh";
		System.out.println(s3);
		System.out.println(s3.hashCode());
		
		String s4 = " Poonam ";
		s3 =s3.concat(s4);
		System.out.println(s3);
		
		String s5 = "Sandesh";
		System.out.println(s5);
		System.out.println(s5.hashCode());
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		String s6 = "  I Love India  ";
		System.out.println(s6.length());
		System.out.println(s6.trim());
		System.out.println(s6.trim().length());
		System.out.println(s6.charAt(5));
		System.out.println(s6.indexOf('d'));
		
		String s7 = "Malayalam";
		System.out.println(s7.indexOf('a'));
		System.out.println(s7.indexOf('a', 4));
		System.out.println(s7.substring(4));
		System.out.println(s7.substring(3, 6)); // Includes Beginning and excludes end
		
		
		char[] ch = s7.toCharArray();
		System.out.print(s7.toCharArray());
		System.out.println( " ");
		
		for ( char c : ch)
		{
			System.out.println(c);
		}
		
		String s8= "";
		System.out.println(s8.length());
		System.out.println(s8.isEmpty());
		
		System.out.println(s7.replace('a','b'));
		System.out.println(s7.replace("Ma", "Ka"));
		
		int a= 10;
		int b= 20;
		System.out.println(a+b);
		System.out.println(String.valueOf(a)+ String.valueOf(b));
		
		 String[] arr= s7.split("a");
		 
		 for ( String str : arr) {
			 
			 System.out.print(str);
		 }
		
		
	}

}
