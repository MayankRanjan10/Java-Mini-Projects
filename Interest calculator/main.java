import java.util.*;

import CalculatorExceptions.InvalidAge;
import CalculatorExceptions.InvalidAmount;
import CalculatorExceptions.InvalidNoOfDays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FDAccount fd;
		RDAccount rd;
		SBAccount sb;
		
		int option=0;
		while (option!=4) {
			System.out.println("1. Interest Calculator -SB"+
								"\n 2. Interest Calculator -FD"+ 
								"\n 3. Interest Calculator -RD"+
								"\n Exit"+
								"\n Enter your option (1..4) : ");
			option = sc.nextInt();
			double amt=0;
			
			switch(option) {
			case 1: 
				System.out.println("Enter the Average amount in your account : ");
				amt= sc.nextDouble();
				try {
					if(amt>0) {
						sb=new SBAccount();
						sb.setAmount(amt);
						System.out.println("Interest gained: Rs. " + sb.calculateInterest());
					}
					else
						throw new InvalidAmount();
				} catch(InvalidAmount e) {}
				
				break;		
				
			case 2: 
				System.out.println("Enter the FD amopunt : ");
				amt= sc.nextDouble();
				
				System.out.println("Enter number of days: ");
				int noOfDays = sc.nextInt();
				
				System.out.println("Enter your age: ");
				int age = sc.nextInt();
				
				try {
					if(amt < 0) {
						throw new InvalidAmount();
					}
					else if(noOfDays < 0) {
						throw new InvalidNoOfDays();
					}
					else if(age < 0) {
						throw new InvalidAge();
					}
					else {
						fd = new FDAccount();
						fd.setAmount(amt);
						fd.setNoOfDays(noOfDays);
						fd.setAgeOfACHolder(age);
						System.out.println("Interest gained: Rs. " + fd.calculateInterest());
					}
					
				}
				catch(InvalidAmount e) {}
				catch(InvalidNoOfDays e) {}
				catch(InvalidAge e) {}
				break;
				
			case 3:
				System.out.println("Enter the RD ammount: ");
				amt = sc.nextDouble();
				
				System.out.println("Enter number of months: ");
				int noOfMonths = sc.nextInt();
								
				try {
					if(amt < 0) {
						throw new InvalidAmount();
					}
					else if(noOfMonths < 0) {
						throw new InvalidNoOfDays();
					}
					
					else {
						rd = new RDAccount();
						rd.setAmount(amt);
						rd.setNoOfMonth(noOfMonths);
						System.out.println("Interest gained: Rs. " + rd.calculateInterest());
					}
				}
				catch(InvalidAmount e) {}
				catch(InvalidNoOfDays e) {}				
				break;	
			
			default:
				System.out.println("Thanks for using Interest Calculator.");
				break;
			}		
		}
	}
}
