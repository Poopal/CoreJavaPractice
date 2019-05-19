package OOPS;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICIBank ib = new ICICIBank();
		ib.credit();
		ib.debit();
		ib.loan();
		ib.fund();
		
		
		Bank b = new ICICIBank();
		b.credit();
		b.debit();
		b.loan();
		
	}

}
