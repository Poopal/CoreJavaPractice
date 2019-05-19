package JavaSessions;

public class ConstructorWithThisKeyword {

	String name;
	String Company;
	int Age;

	public ConstructorWithThisKeyword(String name, String Company, int Age) {

		this.name = name;
		this.Company = Company;
		this.Age = Age;
		System.out.println(name);
		System.out.println(Company);
		System.out.println(Age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Sandesh", "Nagarro", 30);

	}

}
