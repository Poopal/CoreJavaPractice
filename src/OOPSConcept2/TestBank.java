package OOPSConcept2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.homeLoan();
		hs.transferMoney();
		hs.carLoan();
		hs.mutualFunds();
		hs.systematicInvestmentPlan();
		
		System.out.println(USBank.min_bal);
		
		//Dynamic Polymorphism
		//Child class object can be referred by Parent Interface reference variable
		
		USBank ub = new HSBCBank();
		ub.credit();
		ub.debit();
		ub.transferMoney();
	
	
	}

}
