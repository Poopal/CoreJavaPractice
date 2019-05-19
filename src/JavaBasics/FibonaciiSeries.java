package JavaBasics;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int previousNumber=0;
		int nextNumber = 1;
		int maxNumber=20;
		int sum=0;
		
		
		for ( int i=0; i <= maxNumber; i++)
			
		{
			sum= nextNumber + previousNumber;
			previousNumber = nextNumber;
			nextNumber=sum;
			
		}
		System.out.println("Fibonacii Series = "+ sum);
	}

}
