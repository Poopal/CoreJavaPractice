package JavaBasics;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sandesh";
		String p = "Poonam";

		System.out.println("The value of s : " + s);
		System.out.println("The Value of p : " + p);

		// 1. Append s and p
		s = s + p; // SandeshPoonam

		// 2. Store initial String s in String p
		p = s.substring(0, s.length() - p.length());

		// 3. Store initial string b in String a
		s = s.substring(p.length());

		System.out.println("************Result after String Swapping************");
		System.out.println("The value of s : " + s);
		System.out.println("The Value of p : " + p);
	}

}
