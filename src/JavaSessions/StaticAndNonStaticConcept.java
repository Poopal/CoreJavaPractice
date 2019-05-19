package JavaSessions;

public class StaticAndNonStaticConcept {

	String name = "Sandesh";// Non static global variable
	static int age = 30; // Static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to call Static Methods
		// 1. Direct Calling
		Alliance();

		// 2. Calling by ClassName
		StaticAndNonStaticConcept.Alliance();

		// How to Call Static Variables

		// 1. Direct Calling
		System.out.println(age);

		// 2. Calling by ClassName
		System.out.println(StaticAndNonStaticConcept.age);

		// How to Call Non Static methods
		// 1.By Creating Object;
		StaticAndNonStaticConcept object = new StaticAndNonStaticConcept();
		object.Matrimony();

		// How to call Non Static Variable
		System.out.println(object.name);

		// Can i access Static method by using Object reference
		// Yes, we Can, but it will give Warning
		object.Alliance();

	}

	public void Matrimony() // Non Static Method
	{
		System.out.println("JeevanSathi");
	}

	public static void Alliance() // Static Method
	{
		System.out.println("SandeshSingh");
	}

}
