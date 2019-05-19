package OOPSConcept2;

public class HSBCBank implements USBank, RBIBank { //We are achieving Multiple Inheritance
	//Is -a Relationship--- Relationship between Interface and Class ( Implements Keyword) 
	
	
	//If a Class is implementing any interface, then its mandate to define /override all the methods of interface
	public void credit() {
		System.out.println( " Credit Amount is ");
	}

	public void debit() {
		System.out.println( " Debit Amount is ");
	}
	
	public void transferMoney() {
		System.out.println(" Tranferred Amount is ");
	}
	
	public void carLoan() {
		System.out.println(" Car Loan at 9 % ");
	}
	
	public void homeLoan() {
		System.out.println(" homeLoan at 8 % ");
	}

	public void systematicInvestmentPlan() {
		System.out.println("Education Loan at 5 %");
		
	}
	
	public void mutualFunds() {
		System.out.println("Mutual Funds");
		
	}
}
