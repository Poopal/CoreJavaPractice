package JavaBasics;

public class ArmStrongNumber {
	
	public static void isArmStrongNumber(int num)
	
	
	//number : 153
	{
		int cube=0;
		int rem=0;
		int rev=0;
		int t = num;
		
		while( num>0)
		{
			rem=num%10;
			num=num/10;
			cube= cube + rem*rem*rem;	
		}
	
		if ( t==cube) {
			System.out.println("Number is an ArmStrong Number");
		}
		else 
		{
			System.out.println("Number is not an ArmStrong Number");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isArmStrongNumber(153);
		
	}

}
