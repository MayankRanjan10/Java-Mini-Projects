
abstract class generalBank{

	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends generalBank{

	@Override
	public double getSavingsInterestRate(){
		return 4;
	}

	@Override
	public double getFixedDepositInterestRate(){
		return 8.5;
	}
}

class kotMBank extends generalBank {

	@Override
	double getSavingsInterestRate() {
		return 6;
	}

	@Override
	double getFixedDepositInterestRate() {
		return 9;
	}
	
}

class abs1{
	public static void main(String[] args) {
		ICICIBank i = new ICICIBank();
		kotMBank k = new kotMBank();
		generalBank g1 = new kotMBank();
		generalBank g2= new ICICIBank();
		System.out.println();
		System.out.println("Savings Rate of ICICIBank via object of ICICIBank-class : "+i.getSavingsInterestRate());
		System.out.println("Fixed Rate of ICICIBank via object of ICICIBank-class : "+i.getFixedDepositInterestRate());
		System.out.println();
		System.out.println("Savings Rate of kotMBank via object of kotMBank-class : "+k.getSavingsInterestRate());
		System.out.println("Fixed Rate of kotMBank via object of kotMBank-class : "+k.getFixedDepositInterestRate());
		System.out.println();
		System.out.println("Savings Rate of ICICIBank via object of ICICIBank-class assigned to generalBank-class : "+g1.getSavingsInterestRate());
		System.out.println("Fixed Rate of ICICIBank via object of ICICIBank-class assigned to generalBank-class : "+g1.getFixedDepositInterestRate());
		System.out.println();
		System.out.println("Savings Rate of kotMBank via object of kotMBank-class assigned to generalBank-class : "+g2.getSavingsInterestRate());
		System.out.println("Fixed Rate of kotMBank via object of kotMBank-class assigned to generalBank-class : "+g2.getFixedDepositInterestRate());
		
	}
}