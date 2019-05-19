package JavaBasics;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//1.  using third Variable
		int x = 20;
		int y=30;
		
		//int temp;
		
		//temp=x;
		//x=y;
		//y=temp;
		
		//2. Without using third variable
	
		// using + operator
		//x=x+y;
		//y=x-y;
		//x=x-y;
		
		//using * Operator
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
