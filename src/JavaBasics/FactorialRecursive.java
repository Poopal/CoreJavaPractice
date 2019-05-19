package JavaBasics;

public class FactorialRecursive {
	
	//Recursive: A Function calling itself
	
	public static int factorial(int num) {
		
		if ( num== 0 ) {
			return 1;
		}
		else {
			return ( num * factorial(num-1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10));
		
		}
	}


