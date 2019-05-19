package JavaSessions;

public class exceptionHandling {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(arr[6]);
		} catch (StringIndexOutOfBoundsException s) {
			System.out.println("String is not in Range");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Index is out of range");
		} catch (Exception e) {
			System.out.println("Can handle any type of Exception");
		}

		String str = null;

		try {
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println(" Points to null Value");
		}

		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(" Cant divide by Zero");
		} finally {
			System.out.println(" Execute the rest of the code");
		}
	}

}
