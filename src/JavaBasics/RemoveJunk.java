package JavaBasics;

public class RemoveJunk {

	public static void main(String[] args) {

		// Creating String Object using new Keyword
		// Memory will get created in Heap Area and String Constant pool

		String str2 = new String("Poonam");
		String str3 = new String("Poonam");

		if (str2 == str3) {
			System.out.println("Both of the objects pointing to same reference");
		} else {
			System.out.println("Both of object poing to difference reference");
		}

		// Creating String object using first class object/ Using double quotes
		//Memory will get created in Static constant pool ( where duplicates values are not allowed )

		String str4 = "Sandesh";
		String str5 = "Sandesh";

		if (str4 == str5) {
			System.out.println("Both of the objects pointing to same reference");
		} else {
			System.out.println("Both of object poing to difference reference");
		}

		// Remove Junk Character

		String s = "@@#$^*() Selenium **&%^*( Automation $^&**((?><<test:{}{} Engineer";

		s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		// Reverse String

		String str = "Java Is Easy";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		// Split and reverse

		String str1 = "Java is easy";
		String[] arr = str1.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];

			for (int j = s1.length() - 1; j >= 0; j--) {
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
