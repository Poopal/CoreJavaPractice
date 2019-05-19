package JavaBasics;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number=9873456;
		int rem=0;
		int digit = 0;
		int count=0;
		

	while ( number>0)
	{
		rem=number%10;
		number=number/10;
		count++;
		
	}
	
	System.out.println(count);
}

}