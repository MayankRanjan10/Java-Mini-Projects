
public class RDAccount extends Account {
	
	private double monthlyAmount;
	private int noOfMonths;
	
	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		double rateOfInterest = 0;
		double interest = 0;
		
		if (noOfMonths >= 6 && noOfMonths < 9) {
			rateOfInterest = 7.5;
		} else if (noOfMonths >= 9 && noOfMonths < 12) {
			rateOfInterest = 7.75;
		} else if (noOfMonths >= 12 && noOfMonths < 15) {
			rateOfInterest = 8;
		} else if (noOfMonths >= 15 && noOfMonths < 18) {
			rateOfInterest = 8.25;
		} else if (noOfMonths >= 18 && noOfMonths <= 21) {
			rateOfInterest = 8.5;
		} else if (noOfMonths >= 21) {
			rateOfInterest = 8.75;
		}
		
		interest = amount * rateOfInterest / 100;		
		return interest;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setNoOfMonth(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	
	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getAmount() {
		return amount;
	}

	public int getNoOfMonth() {
		return noOfMonths;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}
}
