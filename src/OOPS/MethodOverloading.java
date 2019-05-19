package OOPS;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(10);
		mo.sum(20, 29);

	}

	// method Overloading : When Method name is same with different Arguments/ input
	// parameter within same class

	public void sum() {
		System.out.println("Zero Argumented");
	}

	public void sum(int a) {
		System.out.println("one Argumented : " + a);

	}

	public void sum(int a, int b) {
		System.out.println("two Argumented : " + a + " , " + b);
	}

}
