
public class SBAccount extends Account {
	
	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		String accountType = "Normal";		
		if (accountType.equals("Normal"))
			setInterestRate(4);
		else if(accountType.equals("NRI"))
			setInterestRate(6);
		double amount = getAmount();
		double interestRate = getInterestRate();
		double interest = amount * interestRate / 100.0;		
		return interest;
	}
	
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	private double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}

	private double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}
	
	
	
	

}
