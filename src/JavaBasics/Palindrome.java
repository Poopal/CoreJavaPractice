package JavaBasics;

public class Palindrome {
	
	public static void PalindromeNumber(){
	
	
	int number= 1234321;
	int temp=number;
	int rev=0;
	int rem=0;
	
	while(number>0)
	{
		rem=number%10;
		rev=rev*10+rem;
		number=number/10;	
	}
	
	if(rev==temp)
	{
		System.out.println("Number is Palindrome");
	}
	
	else
	{
		System.out.println("Number is not Palindrome");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeNumber();
	}
}


