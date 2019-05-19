package JavaSessions;

public class B extends A {

	public B() {

		super();
		System.out.println(" This is Child Class Constructor with Zero Parameter ");
	}

	public B(int i) {

		super(i);
		System.out.println(" This is Child Class Constructor with single Parameter ");
	}

	public B(int i, int j) {

		super(i, j);
		System.out.println(" This is Child Class Constructor with two Parameter ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B();
		B obj2 = new B(10);
		B obj3 = new B(10, 20);
	}

}
